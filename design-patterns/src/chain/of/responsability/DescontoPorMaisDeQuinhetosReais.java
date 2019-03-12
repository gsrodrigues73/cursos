package chain.of.responsability;

import strategy.Orcamento;

public class DescontoPorMaisDeQuinhetosReais implements Desconto {

	private Desconto proximo;

//	public double desconto(Orcamento orcamento) {
//		if(orcamento.getValor() > 500.0) {
//			return orcamento.getValor() * 0.07; 
//		}
//		return 0;
//	}

	@Override
	public double desconta(Orcamento orcamento) {
		if(orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.07; 
		}
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		
	}
}
