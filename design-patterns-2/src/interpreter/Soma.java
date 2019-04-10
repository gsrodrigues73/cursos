package interpreter;

import visitor.Visitor;

public class Soma implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Soma(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int valorDaEsquerda = esquerda.avalia();
		int valorDaDireita = direita.avalia();
		
		return valorDaEsquerda + valorDaDireita;
	}
	
	// criado para atender a aula Visitor
	public Expressao getEsquerda() {
		return esquerda;
	}
	
	// criado para atender a aula Visitor
	public Expressao getDireita() {
		return direita;
	}

	// criado para atender a aula Visitor
	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaSoma(this);
		
	}
}
