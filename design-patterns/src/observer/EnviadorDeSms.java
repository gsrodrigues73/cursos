package observer;

import builder.NotaFiscal;

public class EnviadorDeSms implements AcaoAposGerarNota {
	
//	public void enviaPorSMS(NotaFiscal nf) {
	public void executa(NotaFiscal nf) {
		System.out.println("Enviei por SMS a nota fiscal");
	
	}
}
