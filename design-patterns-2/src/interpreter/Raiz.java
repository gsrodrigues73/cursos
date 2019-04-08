package interpreter;

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

}
