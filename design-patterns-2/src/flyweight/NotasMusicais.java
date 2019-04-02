package flyweight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotasMusicais {

	private static Map<String, Nota> notas = new HashMap<String, Nota>();
	private static List<Class<? extends Nota>> clazzes;

	static {
		// notas.put("do", new Do());
		// notas.put("re", new Re());
		// notas.put("mi", new Mi());
		// notas.put("fa", new Fa());
		// notas.put("sol", new Sol());
		// notas.put("la", new La());
		// notas.put("si", new Si());

		clazzes = Arrays.asList(
				Do.class, 
				DoSus.class, 
				Re.class, 
				ReSus.class, 
				Mi.class, 
				Fa.class, 
				FaSus.class, 
				Sol.class, 
				SolSus.class, 
				La.class, 
				LaSus.class, 
				Si.class);

	}

	public Nota pega(String nome) {
		// return notas.get(nome);

		try {
			if (!notas.containsKey(nome)) {
				for (Class<? extends Nota> clazz : clazzes) {
					if (clazz.getSimpleName().toLowerCase().equals(nome)) {
						notas.put(nome, (Nota) clazz.newInstance());
						break;
					}
				}
			}

			return notas.get(nome);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
