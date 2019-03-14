package builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import observer.AcaoAposGerarNota;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double impostos;
	private double valorBruto;
	private String observacoes;
	private Calendar dataEmissao;
	
	// Atributo e métodos criados para atender Observer
	private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;
	
	public NotaFiscalBuilder() {
		todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
	}
	
	public void adicionaAcao(AcaoAposGerarNota acao) {
		todasAcoesASeremExecutadas.add(acao);
		
	}
	
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

	public NotaFiscal constroi() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, impostos, todosItens, observacoes);
		
//		// 1a iniciativa (ações após gerar NF/classe faz muitas coisas)
//		enviaPorEmail (nf);
//		salvaNoBanco(nf);
//		enviaPorSMS(nf);
//		imprime(nf);
		
//		// 2a iniciativa (isolados os códigos/dependencia-alto acoplamento)
//		new EnviadorDeEmail().enviaEmail(nf);
//		new NotaFiscalDao().salvaNoBanco(nf);
//		new EnviadorDeSms().enviaPorSMS(nf);
//		new Impressora().imprime(nf);
		
		// criada a interface AcaoAposGerarNota
		for (AcaoAposGerarNota acao : todasAcoesASeremExecutadas) {
			acao.executa(nf);
			
		}
		
		return nf;
	}

//	private void enviaPorEmail(NotaFiscal nf) {
//		System.out.println("Enviei por e-mail a nota fiscal");
//		
//	}
//	
//	private void salvaNoBanco(NotaFiscal nf) {
//		System.out.println("Salvei no banco a nota fiscal");
//		
//	}
//	
//	private void enviaPorSMS(NotaFiscal nf) {
//		System.out.println("Enviei por SMS a nota fiscal");
//		
//	}
//	
//	private void imprime(NotaFiscal nf) {
//		System.out.println("Imprimi a nota fiscal");
//		
//	}
	
}
