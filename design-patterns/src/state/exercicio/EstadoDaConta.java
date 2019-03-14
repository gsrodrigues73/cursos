package state.exercicio;

import strategy.exercicio.ContaBancaria;

public interface EstadoDaConta {
	
	public void saca(ContaBancaria conta, double valor);
	
	public void deposita(ContaBancaria conta, double valor);
	
}
