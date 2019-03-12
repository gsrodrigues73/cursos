package template_method;

import strategy.Imposto;
import strategy.Orcamento;

public abstract class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		}
		return minimaTaxacao(orcamento);
		
	}

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
	
	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract double minimaTaxacao(Orcamento orcamento);

}
