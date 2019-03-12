package strategy;

public class CalculadorDeImposto2OutroImposto {

	public void RealizaCalculo(Orcamento orcamento, String imposto) {
		
		if (imposto.equals("ICMS")) {
			double icms  = orcamento.getValor() * 0.1;
			System.out.println(icms);
			
		} else if (imposto.equals("ISS")) { 
			double iss  = orcamento.getValor() * 0.06;
			System.out.println(iss);
		}
		// Novo problema... Mais IFs tem que ser incluidos a cada novo imposto
		
		
	}
}
