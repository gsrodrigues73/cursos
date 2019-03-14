package strategy.exercicio;

import state.exercicio.EstadoDaConta;

// Classe criada para atender TestaEstadosDaConta
public class Positivo implements EstadoDaConta {

	@Override
	public void saca(ContaBancaria conta, double valor) {
		conta.saldo -= valor;

		if (conta.saldo < 0)
			conta.estado = new Negativo();
	}

	@Override
	public void deposita(ContaBancaria conta, double valor) {
		conta.saldo += valor * 0.98;
		
	}

}
