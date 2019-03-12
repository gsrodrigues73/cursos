package chain.of.responsability;

import strategy.Orcamento;

public class CalculadorDeDesconto {

	public double calcula(Orcamento orcamento) {
		// Primeira abordagem
		
//		// orcamento com mais de 5 itens ganha desconto
//		if(orcamento.getItens().size() > 5) {
//			return orcamento.getValor() * 0.1;
//		}
//		
//		// valor do orcamento maior que R$ 500
//		if(orcamento.getValor() > 500.0) {
//			return orcamento.getValor() * 0.07; 
//		}
		
		// Segunda abordagem (vários ifs)
		
//		double desconto = new DescontoPorCincoItens().desconto(orcamento);
//		if(desconto == 0) new DescontoPorMaisDeQuinhetosReais().desconto(orcamento);

//		// caso contrário...
//		return 0;
		
		// Terceira abordagem (criando cadeia de chamadas)
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhetosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);
		
		return d1.desconta(orcamento);
		
	}
}
