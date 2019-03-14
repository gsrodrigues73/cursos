package strategy.exercicio;

public class TestaInvestimento {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		
		conta.deposita(10000.0);
		
		RealizadorDeInvestimentos invest = new RealizadorDeInvestimentos();
		
		System.out.println("Investimento Conservador");
		invest.realiza(conta, new Conservador());
		System.out.println();
		
		System.out.println("Investimento Moderado");
		invest.realiza(conta, new Moderado());
		System.out.println();
		
		System.out.println("Investimento Arrojado");
		invest.realiza(conta, new Arrojado());
		
	}

}
