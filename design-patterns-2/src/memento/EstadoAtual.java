package memento;

public class EstadoAtual {
	
	private Contrato contrato;

	public EstadoAtual(Contrato contrato) {
		this.contrato = contrato;
		
	}
	
	public Contrato getEstado() {
		return this.contrato;
		
	}
}
