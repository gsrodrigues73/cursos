package template_method.exercicio;

import chain.of.responsability.Item;
import strategy.Orcamento;
import template_method.ICPP;
import template_method.IKCV;

public class TestaTemplate {

	public static void main(String[] args) {
		Orcamento orcamento1 = new Orcamento(1000.0);
		orcamento1.adicionaItem(new Item("CANETA", 500));
		orcamento1.adicionaItem(new Item("LAPIS", 50));
		orcamento1.adicionaItem(new Item("LIVRO", 150));
		
		Orcamento orcamento2 = new Orcamento(100.0);
		orcamento2.adicionaItem(new Item("LAPIS", 50));
		orcamento2.adicionaItem(new Item("LAPIS", 150));
		
		System.out.println("ICPP 1 = " + new ICPP().calcula(orcamento1));
		System.out.println("IKCV 1 = " + new IKCV().calcula(orcamento1));
		System.out.println("IHIT 1 = " + new IHIT().calcula(orcamento1));
		System.out.println();
		System.out.println("ICPP 2 = " + new ICPP().calcula(orcamento2));
		System.out.println("IKCV 2 = " + new IKCV().calcula(orcamento2));
		System.out.println("IHIT 2 = " + new IHIT().calcula(orcamento2));
	}

}
