package state;

import strategy.Orcamento;

public class TesteDeDescontoExtra {
	
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500.0);
		
		reforma.aplicaDescontoextra();
		
		System.out.println(reforma.getValor());
		
		reforma.aprova();
		
		reforma.aplicaDescontoextra();
		
		System.out.println(reforma.getValor());
		
//		reforma.reprova();				// erro
		reforma.finaliza();
		
//		reforma.aplicaDescontoextra();	// erro
		
		System.out.println(reforma.getValor());
	}
}
