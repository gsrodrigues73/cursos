package builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double impostos;
	private double valorBruto;
	private String observacoes;
	private Calendar dataEmissao;

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
		
	}

	public NotaFiscalBuilder noCNPJ(String cnpj) {
		this.cnpj = cnpj;
		return this;
		
	}

	public NotaFiscalBuilder comItem(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
		
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
		
	}

	public NotaFiscalBuilder naDataAtual() {
		this.dataEmissao = Calendar.getInstance();
		return this;
		
	}

	public NotaFiscal constroe() {
		return new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, impostos, todosItens, observacoes);

	}

}
