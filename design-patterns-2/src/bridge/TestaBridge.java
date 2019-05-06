package bridge;

public class TestaBridge {

	public static void main(String[] args) throws Exception {

		Mapa mapa = new GoogleMaps(); // Aqui poderia utilizar uma Factory para flexibilizar as chamadas da classe de
										// implementação
		mapa.devolveMapa("rua+fonseca");

	}
}
