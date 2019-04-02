package memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {

	private List<EstadoAtual> estadosSalvos = new ArrayList<EstadoAtual>();
	
	public void adiciona(EstadoAtual estadoAtual) {
		estadosSalvos.add(estadoAtual);
		
	}
	
	public EstadoAtual pega(int index) {
		return estadosSalvos.get(index);
		
	}
}
