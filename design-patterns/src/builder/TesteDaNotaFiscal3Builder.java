package builder;

public class TesteDaNotaFiscal3Builder {
	
	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		// Method Chain
		builder.paraEmpresa("razao social")
		.noCNPJ("cnpj")
		.comItem(new ItemDaNota("item 1", 200))
		.comItem(new ItemDaNota("item 2", 300))
		.comItem(new ItemDaNota("item 3", 400))
		.comObservacoes("observacoes")
		.naDataAtual();
		
		NotaFiscal nf = builder.constroe();
		
		System.out.println(nf.getValorBruto());
		
	}
}
