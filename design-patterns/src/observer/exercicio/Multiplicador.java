package observer.exercicio;

import builder.NotaFiscal;
import observer.AcaoAposGerarNota;

public class Multiplicador implements AcaoAposGerarNota {
	
	private double fator;

	public Multiplicador(double fator) {
		this.fator = fator;
		
	}
	
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Valor da nota com o fator " + this.fator + " é: " + nf.getValorBruto() * this.fator);
	}
	
}