package strategy;

import state.EstadoDeUmOrcamento;
import strategy.Orcamento;

// classe criada para atender TesteDeDescontoExtra
// Deve ficar neste pacote (apesar de ser relativo a STATE) 
// para acompanhar o pacote da classe ORCAMENTO 
public class Aprovado implements EstadoDeUmOrcamento {
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.02;
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está aprovado!");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos aprovados não podem ser reprovados!");
		
	}
	
	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}
}
