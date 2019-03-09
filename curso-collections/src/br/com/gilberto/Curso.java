package br.com.gilberto;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	// Criado para atender Aluno
	private Set<Aluno> alunos = new HashSet<Aluno>();
	// A implementa��o de LinkedHashSet garante a ordem de inclus�o
//	private Set<Aluno> alunos = new LinkedHashSet<Aluno>();
//	private Set<Aluno> alunos = new TreeSet<Aluno>();
	
	// Criado para atender TestaBuscaAlunosNoCurso
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
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
		// retorno alterado para proteger a refer�ncia do atributo aulas
		// TestaCurso2Simplificando
//		return aulas;
		return Collections.unmodifiableList(aulas);
	}

	// m�todo inclu�do para TestaCurso2Simplificando
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	// m�todo incl�do para TestaCurso4Encapsulamento
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

	// m�todo incl�do para TestaCurso5ToString
	@Override
	public String toString() {
		return "[Curso: " + this.nome + ", tempo total: " + this.getTempoTotal() + ", aulas: " + this.aulas + "]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		
		// Criado para atender TestaBuscaAlunosNoCurso
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
		
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
		
	}
	
	// m�todo incl�do para TestaCursoComAlunos2ContainsEqualsHashCode
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
//		for (Aluno aluno : alunos) {
//			if (aluno.getNumeroMatricula() == numero) {
//				return aluno;
//				
//			}
//		}
//		throw new NoSuchElementException("matricula n�o encontrada " + numero);
		
		// Criado para atender TestaBuscaAlunosNoCurso
		return matriculaParaAluno.get(numero);
	}

}
