package interpreter;

import visitor.Visitor;

public class Multiplicacao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Multiplicacao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
		
	}
	
	@Override
	public int avalia() {
		int valorDaEsquerda = esquerda.avalia();
		int valorDaDireita = direita.avalia();
		
		return valorDaEsquerda * valorDaDireita;
	}

	// criado para atender a aula Visitor
	@Override
	public void aceita(Visitor impressora) {
		// TODO Auto-generated method stub
		
	}

}
