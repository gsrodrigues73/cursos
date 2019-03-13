package strategy;

import state.EstadoDeUmOrcamento;
import strategy.Orcamento;

// classe criada para atender TesteDeDescontoExtra
// Deve ficar neste pacote (apesar de ser relativo a STATE) 
// para acompanhar o pacote da classe ORCAMENTO 
public class EmAprovacao implements EstadoDeUmOrcamento {
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.05;
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos em aprovação não podem ser finalizados!");
		
	}
}
