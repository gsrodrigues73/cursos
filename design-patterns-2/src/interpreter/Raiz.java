package interpreter;

import visitor.Visitor;

public class Raiz implements Expressao {

	private Expressao numero;

	public Raiz(Expressao numero) {
		this.numero = numero;
		
	}
	
	@Override
	public int avalia() {
		double expressao = numero.avalia();
		
		return (int) Math.sqrt(expressao);
	}

	// criado para atender a aula Visitor
	@Override
	public void aceita(Visitor impressora) {
		// TODO Auto-generated method stub
		
	}

}
