package strategy;

public class CalculadorDeImposto3DelegandoResponsabilidades {

	public void RealizaCalculo(Orcamento orcamento, String imposto) {
		
		if (imposto.equals("ICMS")) {
//			double icms  = new ICMS().CalculaICMS(orcamento);
//			System.out.println(icms);
			
		} else if (imposto.equals("ISS")) { 
//			double iss  = new ISS().CalculaISS(orcamento);
//			System.out.println(iss);
		}
		// Este método vai crescer SEMPRE e com vários IFs
		
	}
}
