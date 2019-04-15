package visitor;

import interpreter.Expressao;
import interpreter.Numero;
import interpreter.Soma;
import interpreter.Subtracao;

public class CalculadoraVisitor {

	public static void main(String[] args) {
		
		Expressao esquerda = new Subtracao(new Soma(new Numero(5), new Numero(7)), new Numero(5));	// 19
		Expressao direita = new Soma(new Numero(2), new Numero(10));
		Expressao soma = new Soma(esquerda, direita);
		
		int resultado = soma.avalia();
		
		System.out.println(resultado);
		
		//Visitor impressora = new ImpressoraVisitor();
		Visitor impressora = new OutraImpressoraVisitor();
		
		soma.aceita(impressora);
		
	}
}
