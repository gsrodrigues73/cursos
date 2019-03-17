package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteCurso {
	
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("Javascript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
//		cursos.forEach(System.out::println);
//		cursos.forEach(c -> System.out.println(c.getNome()));
		
		// Não altera a coleção original (cursos)
//		IntStream mapToInt = cursos.stream()		// Usando o mapToInt
		int sum = cursos.stream()					// Usando o mapToInt + sum()
			.filter(c -> c.getAlunos() >= 100)
//			.forEach(c -> System.out.println(c.getNome()))
			
//			.map(c -> c.getAlunos())							// Lambda
//			.map(Curso::getAlunos)								// Method Reference
			.mapToInt(Curso::getAlunos)
			.sum()
			
//			.forEach(total -> System.out.println(total))		// Lambda
//			.forEach(System.out::println)						// Method Reference
			;
		
		System.out.println(sum);
		
	}
}

class Curso {

	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}
	
	public String getNome() {
		return nome;
	}
	public int getAlunos() {
		return alunos;
	}
}

