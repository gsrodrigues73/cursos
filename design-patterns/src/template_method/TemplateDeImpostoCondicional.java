package template_method;

import strategy.Imposto;
import strategy.Orcamento;

public abstract class TemplateDeImpostoCondicional implements Imposto {
	
	@Override
	public double calcula(Orcamento orcamento) {
	//public final double calcula(Orcamento orcamento) { // O termo FINAL n�o permite que o m�todo seja reescrito
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		}
		return minimaTaxacao(orcamento);
		
	}

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
	
	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract double minimaTaxacao(Orcamento orcamento);

}
