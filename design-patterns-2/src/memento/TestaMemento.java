package memento;

import java.util.Calendar;

public class TestaMemento {

	public static void main(String[] args) {
		
		Historico h1 = new Historico();
		
		Contrato c1 = new Contrato(Calendar.getInstance(), "Gilberto", Estado.NOVO);
		
		h1.adiciona(c1.salvaEstado());
		System.out.println(c1.getEstado());
		
		c1.avanca();
		h1.adiciona(c1.salvaEstado());
		System.out.println(c1.getEstado());
		
		c1.avanca();
		h1.adiciona(c1.salvaEstado());
		System.out.println(c1.getEstado());
		
		EstadoAtual estadoAnterior = h1.pega(1);
		System.out.println(estadoAnterior.getEstado().getEstado());
		
	}
}
