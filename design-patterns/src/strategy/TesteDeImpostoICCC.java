package strategy;

public class TesteDeImpostoICCC {

	public static void main(String[] args) {
		Imposto iccc = new ICCC();
		
		Orcamento orcamento1 = new Orcamento(200);
		Orcamento orcamento2 = new Orcamento(2000);
		Orcamento orcamento3 = new Orcamento(20000);
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		
		System.out.println("5% de " + orcamento1.getValor());
		calculador.realizaCalculo(orcamento1, iccc);
		
		System.out.println("7% de " + orcamento2.getValor());
		calculador.realizaCalculo(orcamento2, iccc);
		
		System.out.println("8% de " + orcamento3.getValor());
		calculador.realizaCalculo(orcamento3, iccc);
	}

}
