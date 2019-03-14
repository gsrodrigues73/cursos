package strategy.exercicio;

import state.exercicio.EstadoDaConta;

public class ContaBancaria {

	// atributo alterado para atender TestaEstadosDaConta (PROTECTED)
	protected double saldo;
	
	// atributo criado para atender TestaEstadosDaConta
	public EstadoDaConta estado;
	
	// constructor criado para atender TestaEstadosDaConta
	public ContaBancaria() {
		estado = new Positivo();
		
	}
	
	public double getSaldo() {
		return saldo;
	}

	// métodos alterado para atender TestaEstadosDaConta
	public void deposita(double valor) {
//		this.saldo += valor;
		estado.deposita(this, valor);
		
	}
	
	// métodos criados para atender TestaEstadosDaConta
	public void saca(double valor) {
		estado.saca(this, valor);
		
	}
}
