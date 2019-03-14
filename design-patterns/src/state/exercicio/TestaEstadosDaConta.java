package state.exercicio;

import strategy.exercicio.ContaBancaria;

public class TestaEstadosDaConta {
	
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		
		conta.deposita(1000);
		
		System.out.println(conta.getSaldo());
		
		conta.saca(2000);
		System.out.println(conta.getSaldo());
		
		conta.saca(20);
		
	}
}
