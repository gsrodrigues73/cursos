package strategy;

import decorator.Imposto;

public class CalculadorDeImposto5ImpostoQualquer {

	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		
		double imposto  = impostoQualquer.calcula(orcamento);
		System.out.println(imposto);
		
	}
}
