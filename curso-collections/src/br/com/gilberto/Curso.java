package br.com.gilberto;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		// retorno alterado para proteger a referência do atributo aulas
		// TestaCurso2Simplificando
//		return aulas;
		return Collections.unmodifiableList(aulas);
	}

	// método incluído para TestaCurso2Simplificando
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	// método inclído para TestaCurso4Encapsulamento
	public int getTempoTotal() {
//		int tempoTotal = 0;
//		
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//			
//		}
//		
//		return tempoTotal;

		// outra forma
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	// método inclído para TestaCurso5ToString
	@Override
	public String toString() {
		return "[Curso: " + this.nome + ", tempo total: " + this.getTempoTotal() + ", aulas: " + this.aulas + "]";
	}

}
