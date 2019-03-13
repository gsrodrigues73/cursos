package decorator.exercicio;

import java.util.ArrayList;
import java.util.List;

import chain.of.responsability.exercicio.Conta;

public class FiltroMaiorQue500MilReais extends Filtro {
	
	public FiltroMaiorQue500MilReais(Filtro outroFiltro) {
		super(outroFiltro);
		
	}
	
	public FiltroMaiorQue500MilReais() {
	}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
		for (Conta c : contas) {
			if (c.getSaldo() > 500000)
				filtrada.add(c);
		}
		
        filtrada.addAll(proximo(contas));
        return filtrada;
        
	}

}
