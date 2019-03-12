package strategy;

//Classe criada para CalculadorDeImposto3DelegandoResponsabilidades
public class ISS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
}
