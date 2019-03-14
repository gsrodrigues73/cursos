package builder;

public class TesteDaNotaFiscal2AplicandoBuilder {
	
	public static void main(String[] args) {
		CriadorDeNotaFiscal criador = new CriadorDeNotaFiscal();
		
		criador.paraEmpresa("razao social");
		criador.noCNPJ("cnpj");
		criador.comItem(new ItemDaNota("item 1", 200));
		criador.comItem(new ItemDaNota("item 2", 300));
		criador.comItem(new ItemDaNota("item 3", 400));
		criador.comObservacoes("observacoes");
		criador.naDataAtual();
		
		NotaFiscal nf = criador.constroe();
		
		System.out.println(nf.getValorBruto());
		
	}
}
