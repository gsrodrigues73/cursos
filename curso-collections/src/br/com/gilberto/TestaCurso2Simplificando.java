package br.com.gilberto;

public class TestaCurso2Simplificando {

	public static void main(String[] args) {
		
		// Aula de Relacionamento com cole��es
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");
		
		// Estas linhas podem ser substitu�das
//		List<Aula> aulas = javaColecoes.getAulas();
//		aulas.add(new Aula("Trabalhando com ArrayList", 21));
		
		// Por esta, mas percebemos que a classe estaria vulner�vel para 
		// qualquer um alterar insdiscriminadamente o conte�do
//		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 22));
		
		System.out.println(javaColecoes.getAulas());
		
	}

}
