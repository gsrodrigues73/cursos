package br.com.gilberto;

public class Aluno {
	
	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		// verificação incluída para TestaCursoComAlunos2ContainsEqualsHashCode
		if (nome == null) {
			throw new NullPointerException("nome não pode ser nulo");
		}
		
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	// método inclído para TestaCursoComAlunos2ContainsEqualsHashCode
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}
	
	
	// método inclído para TestaCursoComAlunos2ContainsEqualsHashCode
	@Override
	public int hashCode() {
//		return this.nome.charAt(0);
		return this.nome.hashCode();
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}
	
}
