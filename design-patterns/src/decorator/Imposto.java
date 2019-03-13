package decorator;

import strategy.Orcamento;

public abstract class Imposto {
	
	protected Imposto outroImposto;
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
		
	}
	
	public Imposto() {
	}
	
	public abstract double calcula(Orcamento orcamento);
	
	protected double calculoDoOutroImposto(Orcamento orcamento) {
		if(this.outroImposto == null)
			return 0;
		
		return outroImposto.calcula(orcamento);
	}

}
