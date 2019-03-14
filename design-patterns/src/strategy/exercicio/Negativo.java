package strategy.exercicio;

import state.exercicio.EstadoDaConta;

public class Negativo implements EstadoDaConta {

	@Override
	public void saca(ContaBancaria conta, double valor) {
		throw new RuntimeException("Sua conta está negativada. Não é permitido saque!");
		
	}

	@Override
	public void deposita(ContaBancaria conta, double valor) {
		conta.saldo += valor * 0.95;
		
		if (conta.saldo > 0)
			conta.estado = new Positivo();
		
	}

}
