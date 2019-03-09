package br.com.gilberto;

public class TestaCursoComAlunos2ContainsEqualsHashCode {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Rodrigo", 34672);
		Aluno a2 = new Aluno("Guilherme", 5617);
		Aluno a3 = new Aluno("Maurício", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println("O aluno " + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno rodrigo = new Aluno ("Rodrigo", 34672);
		// Para Sets, precisa reescrever os métodos equals + hascode OBRIGATORIAMENTE
		// Desta forma, o contains não encontra corretamente o objeto
		// A linha abaixo vai apresentar FALSE
		System.out.println(javaColecoes.estaMatriculado(rodrigo));
		
		System.out.println("O a1 é == ao rodrigo?");
		System.out.println(a1.equals(rodrigo));
		
	}
}
