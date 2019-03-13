package template_method;

import decorator.Imposto;
import strategy.Orcamento;

//public class ICPP implements Imposto {
public class ICPP extends TemplateDeImpostoCondicional {
	
	// Construtores inclu�dos para atender TesteDeImpostosComplexos
	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICPP() {
	}
	
//	@Override
//	public double calcula(Orcamento orcamento) {
//		if(orcamento.getValor() > 500)
//			return orcamento.getValor() * 0.07;
//		else
//			return orcamento.getValor() * 0.05;
//	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() > 500);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

}
