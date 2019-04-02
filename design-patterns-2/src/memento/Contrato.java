package memento;

import java.util.Calendar;

public class Contrato {

	private Calendar data;
	private String cliente;
	private Estado estado;
	
	public Contrato(Calendar data, String cliente, Estado estado) {
		this.data = data;
		this.cliente = cliente;
		this.estado = estado;
	}

	public Calendar getData() {
		return data;
	}

	public String getCliente() {
		return cliente;
	}

	public Estado getEstado() {
		return estado;
	}
	
	public void avanca() {
		if(this.estado == Estado.NOVO) estado = Estado.EM_ANDAMENTO;
		else if(this.estado == Estado.EM_ANDAMENTO) estado = Estado.ACERTADO;
		else if(this.estado == Estado.ACERTADO) estado = Estado.CONCLUIDO;
		
	}
	
	public EstadoAtual salvaEstado() {
		return new EstadoAtual(new Contrato(this.data, this.cliente, this.estado));
		
	}
}
