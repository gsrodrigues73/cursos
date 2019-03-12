package chain.of.responsability.exercicio;

public class Conta {
	
	private String titular;
	private double saldo;
	// atributos criados para atender o RelatorioComplexo
	private int numero;
	private int agencia;
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public int getAgencia() {
		return agencia;
	}
	
	
}