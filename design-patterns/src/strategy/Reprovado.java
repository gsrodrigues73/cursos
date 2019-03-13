package strategy;

import state.EstadoDeUmOrcamento;
import strategy.Orcamento;

// classe criada para atender TesteDeDescontoExtra
// Deve ficar neste pacote (apesar de ser relativo a STATE) 
// para acompanhar o pacote da classe ORCAMENTO 
public class Reprovado implements EstadoDeUmOrcamento {
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos reprovados n�o recebem desconto extra!");
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos reprovados n�o podem ser aprovados!");
		
	}
	
	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� est� reprovado!");
		
	}
	
	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}
}
