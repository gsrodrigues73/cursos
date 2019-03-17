package method_reference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings_MethodReference {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");

//		Comparator<String> comparador = new ComparadorPorTamanho();
//		palavras.sort(comparador);

		// Lambda
//		palavras.sort((s1, s2) -> s1.length() - s2.length());
		
		
		/*
		Function<String, Integer> funcao1 = s -> s.length();
		Function<String, Integer> funcao2 = String::length;
		Function<String, Integer> funcao3 = new Function<String, Integer>() {

			@Override
			public Integer apply(String s) {
				return s.length();
			}
		}; 
		
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		*/

		// Lambda
//		palavras.sort(Comparator.comparing(s -> s.length()));
		
		// Method Reference
// 		palavras.sort(String.CASE_INSENSITIVE_ORDER);
 		palavras.sort(Comparator.comparing(String::length));
		
		System.out.println(palavras);
		
		// Method Reference
//		Consumer<String> impressor = System.out::println;
//		palavras.forEach(impressor);
		
		// Method Reference
		palavras.forEach(System.out::println);

//		palavras.forEach(t -> System.out.println(t));
	}
}