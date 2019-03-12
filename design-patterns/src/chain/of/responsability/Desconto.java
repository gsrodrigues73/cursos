package chain.of.responsability;

import strategy.Orcamento;

public interface Desconto {

	public double desconta(Orcamento orcamento);
	
	public void setProximo(Desconto proximo);
	
}
