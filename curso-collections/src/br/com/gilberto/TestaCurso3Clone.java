package br.com.gilberto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso3Clone {

	public static void main(String[] args) {
		
		// Mais práticas com relacionamentos
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
//		Collections.sort(aulasImutaveis);	// provoca erro
		
		// Criado um clone MUTAVEL da lista
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
	}

}
