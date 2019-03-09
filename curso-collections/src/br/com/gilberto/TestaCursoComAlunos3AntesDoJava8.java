package br.com.gilberto;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAlunos3AntesDoJava8 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 22));
		
		Aluno a1 = new Aluno("Rodrigo", 34672);
		Aluno a2 = new Aluno("Guilherme", 5617);
		Aluno a3 = new Aluno("Maur�cio", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		
		// Implementa��o antiga (com Iterator)
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		
		while (iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		// Erro (exception NoSuchElementException)
//		Aluno ultimo = iterador.next();
		
//		for (Aluno a : javaColecoes.getAlunos()) {
//			System.out.println(a);
//		}
		
		System.out.println("O aluno " + a1 + " est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno rodrigo = new Aluno ("Rodrigo", 34672);
		// Para Sets, precisa reescrever os m�todos equals + hascode OBRIGATORIAMENTE
		// Desta forma, o contains n�o encontra corretamente o objeto
		// A linha abaixo vai apresentar FALSE
		System.out.println(javaColecoes.estaMatriculado(rodrigo));
		
		System.out.println("O a1 � == ao rodrigo?");
		System.out.println(a1.equals(rodrigo));
		
	}
}
