package interpreter;

import visitor.Visitor;

public class Divisao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Divisao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
		
		if (direita.avalia()==0) {
			throw new RuntimeException("Não pode dividir por zero.");
		}
	}
	
	@Override
	public int avalia() {
		int valorDaEsquerda = esquerda.avalia();
		int valorDaDireita = direita.avalia();
		
		return valorDaEsquerda / valorDaDireita;
	}

	// criado para atender a aula Visitor
	@Override
	public void aceita(Visitor impressora) {
		// TODO Auto-generated method stub
		
	}

}
