package br.com.gilberto;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos1Conjuntos {

	public static void main(String[] args) {
//		Set<String> alunos = new HashSet<String>();
		Collection<String> alunos = new HashSet<String>();
		
		alunos.add("Rodigo");
		alunos.add("Alberto");
		alunos.add("Nico");
		alunos.add("S�rgio");
		alunos.add("Renan");
		alunos.add("Maur�cio");
		alunos.add("Maur�cio");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo");
		
		alunos.remove("S�rgio");
		
		System.out.println(pauloEstaMatriculado);
		
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		// N�o � ordenado
		System.out.println(alunos);
		
//		List<String> alunosEmLista = new ArrayList<>(alunos);
		
	}

}
