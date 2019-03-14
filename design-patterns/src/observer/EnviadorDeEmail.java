package observer;

import builder.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota {
	
//	public void enviaEmail(NotaFiscal nf) {
	public void executa(NotaFiscal nf) {
		System.out.println("Enviei por e-mail a nota fiscal");
		
	}
}