package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chain.of.responsability.Item;
import state.EstadoDeUmOrcamento;

public class Orcamento {

	protected double valor;
	private final List<Item> itens;
	
	// Após criados os objetos com os estados, substituir o "estadoAtual" 
	// e suas constantes em um atributo com a interface EstadoDeUmOrcamento

	// atributos criados para atender TesteDeDescontoExtra
//	private int estadoAtual;
//	public static final int EM_APROVACAO = 1;
//	public static final int APROVADO = 2;
	
	EstadoDeUmOrcamento estadoAtual;
	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<>();
		this.estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;

	}

	public void adicionaItem(Item item) {
		this.itens.add(item);

	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);

	}

	// método criado para atender TesteDeDescontoExtra
	public void aplicaDescontoextra() {
		
//		if(ORCAMENTO ESTA EM APROVACAO) valor = valor - (valor * 0.05);
		
		// Após criados os objetos com os estados, substituir o "estadoAtual" 
		// e suas constantes em um atributo com a interface EstadoDeUmOrcamento

//		if (estadoAtual == EM_APROVACAO)
//			valor = valor - (valor * 0.05);
//		else if (estadoAtual == APROVADO)
//			valor = valor - (valor * 0.02);
//		else
//			throw new RuntimeException("Somente orçamento EM APROVAÇÃO ou APROVADO recebem desconto extra!");
		
		estadoAtual.aplicaDescontoExtra(this);
		
	}
	
	public void aprova() {
		estadoAtual.aprova(this);
		
	}
	
	public void reprova() {
		estadoAtual.reprova(this);
	}
	
	public void finaliza() {
		estadoAtual.finaliza(this);
	}
}
