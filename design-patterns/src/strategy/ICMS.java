package strategy;

// Classe criada para CalculadorDeImposto3DelegandoResponsabilidades
public class ICMS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}
}
