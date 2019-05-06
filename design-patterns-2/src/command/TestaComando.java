package command;

public class TestaComando {

	public static void main(String[] args) {
		Pedido p1 = new Pedido("Mauricio", 150.0);
		Pedido p2 = new Pedido("Marcelo", 200.0);
		
		FilaDeTrabalho fila = new FilaDeTrabalho();
		
		fila.adiciona(new PagaPedido(p1));
		fila.adiciona(new PagaPedido(p2));
		fila.adiciona(new ConcluiPedido(p1));
		
		fila.processa();
		
	}
}
