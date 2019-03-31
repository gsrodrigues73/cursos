package flyweight;

import java.util.Arrays;
import java.util.List;

public class TestaFlyweight {

	public static void main(String[] args) {

		NotasMusicais notas = new NotasMusicais();

		// List<Nota> musica = Arrays.asList(new Do(), new Re(), new Mi(), new Fa(), new
		// Fa(), new Fa());
		List<Nota> musica = Arrays.asList(notas.pega("do"), notas.pega("re"), notas.pega("mi"), notas.pega("fa"),
				notas.pega("fa"), notas.pega("fa"));
		
//		System.out.println(musica);
		Piano piano = new Piano();
		piano.toca(musica);
	}
}
