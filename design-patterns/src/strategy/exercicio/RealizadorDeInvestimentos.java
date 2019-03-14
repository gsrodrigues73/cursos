package strategy.exercicio;

public class RealizadorDeInvestimentos {

	public void realiza(ContaBancaria conta, Investimento investimento) {
		double resultado = investimento.calcula(conta);
		
		System.out.println("Saldo anterior: " + conta.getSaldo());
		
		conta.deposita(resultado * 0.75);
		
		System.out.println("Novo saldo: " + conta.getSaldo());
		
	}
	
}
