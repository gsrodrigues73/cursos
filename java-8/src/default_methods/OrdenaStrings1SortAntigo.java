package default_methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaStrings1SortAntigo  {
	
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("alura online");
		palavras.add("editora casa do c�digo");
		palavras.add("caelum");
		
		Collections.sort(palavras);
		
		System.out.println(palavras);
		
	}
}
