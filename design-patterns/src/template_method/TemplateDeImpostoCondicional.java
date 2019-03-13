package template_method;

import decorator.Imposto;
import strategy.Orcamento;

//public abstract class TemplateDeImpostoCondicional implements Imposto {
//Alterado para extends para atender TesteDeImpostosComplexos
public abstract class TemplateDeImpostoCondicional extends Imposto {
	
	public TemplateDeImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public TemplateDeImpostoCondicional() {
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
	//public final double calcula(Orcamento orcamento) { // O termo FINAL não permite que o método seja reescrito
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}
		return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		
	}

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
	
	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract double minimaTaxacao(Orcamento orcamento);

}
