package observer;

import builder.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNota {

//	public void salvaNoBanco(NotaFiscal nf) {
	public void executa(NotaFiscal nf) {
		System.out.println("Salvei no banco a nota fiscal");
	
	}
}
