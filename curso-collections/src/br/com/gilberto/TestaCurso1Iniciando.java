package br.com.gilberto;

import java.util.List;

public class TestaCurso1Iniciando {

	public static void main(String[] args) {
		
		// Aula de Relacionamento com coleções
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
		aulas.add(new Aula("Trabalhando com ArrayList", 21));
		
		System.out.println(aulas);
		
		// Já replica na lista de Aulas dentro de Curso 
		System.out.println(javaColecoes.getAulas());
		
		// Até porque é a mesma referência
		System.out.println(aulas == javaColecoes.getAulas());
		
	}

}
