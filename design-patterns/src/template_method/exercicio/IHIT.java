package template_method.exercicio;

import java.util.ArrayList;
import java.util.List;

import chain.of.responsability.Item;
import strategy.Orcamento;
import template_method.TemplateDeImpostoCondicional;

public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return temDoisItensComMesmoNome(orcamento);
	}

	private boolean temDoisItensComMesmoNome(Orcamento orcamento) {
		List<String> itensInterno = new ArrayList<String>();
		
		for(Item item : orcamento.getItens()) {
			if(itensInterno.contains(item.getNome())) 
				return true;
			
			itensInterno.add(item.getNome());
		}
		return false;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.13) + 100.0;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * (0.01 * orcamento.getItens().size())) ;
	}

}
