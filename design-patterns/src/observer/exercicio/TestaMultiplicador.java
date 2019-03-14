package observer.exercicio;

import java.util.ArrayList;
import java.util.List;

import builder.ItemDaNota;
import builder.NotaFiscal;
import builder.NotaFiscalBuilder;
import observer.AcaoAposGerarNota;

public class TestaMultiplicador {

	public static void main(String[] args) {
		List<AcaoAposGerarNota> lista = new ArrayList<AcaoAposGerarNota>();
		lista.add(new Multiplicador(2));
		lista.add(new Multiplicador(3));
		lista.add(new Multiplicador(5.5));
		
//		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		NotaFiscalBuilder builder = new NotaFiscalBuilder(lista);
		
//		builder.adicionaAcao(new Multiplicador(2));
//		builder.adicionaAcao(new Multiplicador(3));
//		builder.adicionaAcao(new Multiplicador(5.5));

		NotaFiscal nf = builder.paraEmpresa("razaoSocial").noCNPJ("cnpj").comItem(new ItemDaNota("item 1", 100))
				.comItem(new ItemDaNota("item 2", 200)).comItem(new ItemDaNota("item 3", 300))
				.comObservacoes("observacoes").naDataAtual().constroi();

		System.out.println(nf.getValorBruto());

	}

}
