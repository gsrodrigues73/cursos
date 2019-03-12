package strategy;

public class CalculadorDeImposto5ImpostoQualquer {

	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		
		double imposto  = impostoQualquer.calcula(orcamento);
		System.out.println(imposto);
		
	}
}
