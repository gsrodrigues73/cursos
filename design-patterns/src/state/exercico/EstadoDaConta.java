package state.exercico;

import strategy.exercico.ContaBancaria;

public interface EstadoDaConta {
	
	public void saca(ContaBancaria conta, double valor);
	
	public void deposita(ContaBancaria conta, double valor);
	
}
