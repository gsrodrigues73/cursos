package strategy;

public class TesteDeImposto {

	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(500);
		
		CalculadorDeImposto5ImpostoQualquer calculador = new CalculadorDeImposto5ImpostoQualquer();
		
		calculador.realizaCalculo(orcamento, iss);
		
		// o objeto CalculadorDeImposto poderia ser substituído por esta linha
//		System.out.println(iss.calcula(orcamento));
		
		calculador.realizaCalculo(orcamento, icms);
	}

}
