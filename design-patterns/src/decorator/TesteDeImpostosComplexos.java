package decorator;

import strategy.ICMS;
import strategy.ISS;
import strategy.Orcamento;
import template_method.ICPP;

public class TesteDeImpostosComplexos {
	
	public static void main(String[] args) {
//		Imposto iss = new ISS();
//		Imposto issComIcms = new ISSComICMS();
//		Imposto issComIcmsComIcpp = new ISSComICMSComICPP();
		
//		Imposto iss = new ISS(new ICMS());
		Imposto iss = new ISS(new ICMS(new ICPP()));
		
		Orcamento orcamento = new Orcamento(500.0);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);
		
	}
}