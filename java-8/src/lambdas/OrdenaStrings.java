package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("alura online");
		palavras.add("editora casa do c�digo");
		palavras.add("caelum");

//		Comparator<String> comparador = new ComparadorPorTamanho();
//		palavras.sort(comparador);

		// Classe an�nima
//		palavras.sort(new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				return s1.length() - s2.length();
//			}
//			
//		});

		// Lambda
		palavras.sort((s1, s2) -> s1.length() - s2.length());

		System.out.println(palavras);

		// Substituindo por uma classe an�nima
//		Consumer<String> consumidor = new ImprimeNaLinha();
//		Consumer<String> consumidor = new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		};

		// Classe An�nima
//		palavras.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		});

		// Lambda (implementa��o 1)
//		palavras.forEach((String t) -> {
//			System.out.println(t);
//		});

		// Lambda (implementa��o 2)
		palavras.forEach(t -> System.out.println(t));

		Consumer<String> impressor = s -> System.out.println(s);
		
		palavras.forEach(impressor);

	}
}

//class ImprimeNaLinha implements Consumer<String> {
//
//	@Override
//	public void accept(String t) {
//		System.out.println(t);
//		
//	}
//
//}

//class ComparadorPorTamanho implements Comparator<String> {
//
//	@Override
//	public int compare(String s1, String s2) {
//		return s1.length() - s2.length();
//	}
//
//}