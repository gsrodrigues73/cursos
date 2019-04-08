package interpreter;

public class Calculadora {

	public static void main(String[] args) {
		
		//Expressao conta = new Soma(new Numero(10), new Numero(20));
		
//		Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));	//17
		Expressao esquerda = new Subtracao(new Soma(new Numero(5), new Numero(7)), new Numero(5));	// 19
		Expressao direita = new Soma(new Numero(2), new Numero(10));
		Expressao soma = new Soma(esquerda, direita);
		
		int resultado = soma.avalia();
		
		System.out.println(resultado);
	}
}
