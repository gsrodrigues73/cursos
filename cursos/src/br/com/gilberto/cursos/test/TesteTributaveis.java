package br.com.gilberto.cursos.test;

import br.com.gilberto.cursos.modelo.CalculadorDeImposto;
import br.com.gilberto.cursos.modelo.ContaCorrente;
import br.com.gilberto.cursos.modelo.SeguroDeVida;

//classe Teste
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc= new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());

	}

}
