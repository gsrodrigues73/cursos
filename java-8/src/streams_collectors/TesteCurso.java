package streams_collectors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
//		int sum = cursos.stream()					// Usando o mapToInt + sum()
//			.filter(c -> c.getAlunos() >= 100)
////			.forEach(c -> System.out.println(c.getNome()))
//			
////			.map(c -> c.getAlunos())							// Lambda
////			.map(Curso::getAlunos)								// Method Reference
//			.mapToInt(Curso::getAlunos)
//			.sum()
//			
////			.forEach(total -> System.out.println(total))		// Lambda
////			.forEach(System.out::println)						// Method Reference
//			;
//		
//		System.out.println(sum);
		
//		Stream<String> nomes = cursos.stream().map(Curso::getNome);
//		nomes.forEach(System.out::println);
		
//		Optional<Curso> optionalCurso = cursos.stream()
//			.filter(c -> c.getAlunos() >= 100)
//			.findAny()
//		;
//		optionalCurso.ifPresent(c -> System.out.println(c.getNome()));
		
//		OptionalDouble average = cursos.stream()
//			.filter(c -> c.getAlunos() >= 100)
//			.mapToInt(Curso::getAlunos)
//			.average()
//		;
//		System.out.println(average);
		
//		List<Curso> resultado = cursos.stream()
//		cursos = cursos.stream()
//				.filter(c -> c.getAlunos() >= 100)
//				.collect(Collectors.toList())
//		;

//		cursos.stream()
//			.forEach(c -> System.out.println(c.getNome()))
//		;
		
//		Map<String, Integer> mapa = 
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toMap(
					c -> c.getNome(), 
					c -> c.getAlunos()))
			.forEach((nome, alunos) -> System.out.println("curso " + nome + " tem " + alunos + " alunos"));
		;
		
//		System.out.println(mapa);
		
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

