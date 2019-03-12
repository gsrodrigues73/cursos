package strategy.exercico;

public class Conservador implements Investimento {

	@Override
	public double calcula(ContaBancaria conta) {
		return conta.getSaldo() * 0.008;
	}

}
