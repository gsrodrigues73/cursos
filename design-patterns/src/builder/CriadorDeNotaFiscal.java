package builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CriadorDeNotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double impostos;
	private double valorBruto;
	private String observacoes;
	private Calendar dataEmissao;

	public void paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;

	}

	public void noCNPJ(String cnpj) {
		this.cnpj = cnpj;

	}

	public void comItem(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;

	}

	public void comObservacoes(String observacoes) {
		this.observacoes = observacoes;

	}

	public void naDataAtual() {
		this.dataEmissao = Calendar.getInstance();

	}

	public NotaFiscal constroe() {
		return new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, impostos, todosItens, observacoes);

	}

}
