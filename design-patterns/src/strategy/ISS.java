package strategy;

import decorator.Imposto;

//Classe criada para CalculadorDeImposto3DelegandoResponsabilidades
//public class ISS implements Imposto {
// Alterado para extends para atender TesteDeImpostosComplexos
public class ISS extends Imposto {
	
	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ISS() {
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}

}
