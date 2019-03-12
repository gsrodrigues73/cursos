package strategy;

public class CalculadorDeImposto1Criacacao {

	public void RealizaCalculo(Orcamento orcamento) {
		
		double icms  = orcamento.getValor() * 0.1;
		
		System.out.println(icms);
		
		
	}
}
