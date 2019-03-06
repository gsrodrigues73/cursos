package br.com.gilberto;

import java.util.List;

public class TestaCurso1Iniciando {

	public static void main(String[] args) {
		
		// Aula de Relacionamento com cole��es
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
		aulas.add(new Aula("Trabalhando com ArrayList", 21));
		
		System.out.println(aulas);
		
		// J� replica na lista de Aulas dentro de Curso 
		System.out.println(javaColecoes.getAulas());
		
		// At� porque � a mesma refer�ncia
		System.out.println(aulas == javaColecoes.getAulas());
		
	}

}
