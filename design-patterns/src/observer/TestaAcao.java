package observer;

import builder.ItemDaNota;
import builder.NotaFiscal;
import builder.NotaFiscalBuilder;
import observer.exercicio.Multiplicador;

public class TestaAcao {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();

		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new NotaFiscalDao());
		builder.adicionaAcao(new EnviadorDeSms());
		builder.adicionaAcao(new Impressora());

		NotaFiscal nf = builder.paraEmpresa("razaoSocial").noCNPJ("cnpj").comItem(new ItemDaNota("nome", 100))
				.comObservacoes("observacoes").naDataAtual().constroi();
		
		System.out.println(nf.getValorBruto());
		
	}

}
