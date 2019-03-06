package br.com.gilberto;

public class TestaCurso2Simplificando {

	public static void main(String[] args) {
		
		// Aula de Relacionamento com coleções
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		// Estas linhas podem ser substituídas
//		List<Aula> aulas = javaColecoes.getAulas();
//		aulas.add(new Aula("Trabalhando com ArrayList", 21));
		
		// Por esta, mas percebemos que a classe estaria vulnerável para 
		// qualquer um alterar insdiscriminadamente o conteúdo
//		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		System.out.println(javaColecoes.getAulas());
		
	}

}
