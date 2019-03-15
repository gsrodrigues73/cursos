package default_methods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings3Sort  {
	
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
//		Collections.sort(palavras, comparador);
		palavras.sort(comparador);
		
		System.out.println(palavras);
		
	}
}

