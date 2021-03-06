package decorator.exercicio;

import decorator.Imposto;
import strategy.Orcamento;

public class ImpostoMuitoAlto extends Imposto {

	public ImpostoMuitoAlto(Imposto imposto) {
		super(imposto);
	}
	
	public ImpostoMuitoAlto() {
		super();
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculoDoOutroImposto(orcamento);
	}
	
	
}
