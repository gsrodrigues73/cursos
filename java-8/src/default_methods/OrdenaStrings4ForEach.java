package default_methods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings4ForEach  {
	
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
//		Collections.sort(palavras, comparador);
		palavras.sort(comparador);
		
		System.out.println(palavras);
		
//		for (String p : palavras) {
//			System.out.println(p);
//		}
		
		Consumer<String> consumidor = new ImprimeNaLinha()	;
		
		palavras.forEach(consumidor);
		
	}
}

class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
		
	}

}