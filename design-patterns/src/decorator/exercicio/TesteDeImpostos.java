package decorator.exercicio;

import decorator.Imposto;
import strategy.ICMS;
import strategy.Orcamento;

public class TesteDeImpostos {
	
	public static void main(String[] args) {
		Imposto impostos = new ImpostoMuitoAlto(new ICMS());
		
		Orcamento orcamento = new Orcamento(500.0);
		
		System.out.println(impostos.calcula(orcamento));
	}
}
