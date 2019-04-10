package interpreter;

import visitor.Visitor;

public class Numero implements Expressao {

	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public int avalia() {
		return this.numero;
	}
	
	// incluído para atender a aula Visitor
	public int getNumero() {
		return this.numero;
	}

	// criado para atender a aula Visitor
	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaNumero(this);
		
	}
}
