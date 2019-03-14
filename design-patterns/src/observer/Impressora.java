package observer;

import builder.NotaFiscal;

public class Impressora implements AcaoAposGerarNota {

//	public void imprime(NotaFiscal nf) {
	public void executa(NotaFiscal nf) {
		System.out.println("Imprimi a nota fiscal");
		
	}
}
