package template_method;

import chain.of.responsability.Item;
import decorator.Imposto;
import strategy.Orcamento;

//public class IKCV implements Imposto {
public class IKCV extends TemplateDeImpostoCondicional {
	
	// Construtores incluídos para atender TesteDeImpostosComplexos
	public IKCV(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public IKCV() {
	}
	
//	@Override
//	public double calcula(Orcamento orcamento) {
//		if(orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento))
//			return orcamento.getValor() * 0.1;
//		else
//			return orcamento.getValor() * 0.06;
//	}

	private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
		for (Item item : orcamento.getItens())
			if(item.getValor() > 100) return true;
		
		return false;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento));
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
