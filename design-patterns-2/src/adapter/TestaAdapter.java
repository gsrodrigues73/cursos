package adapter;

import java.util.Calendar;

public class TestaAdapter {

	public static void main(String[] args) {
		
		Relogio relogio = new RelogioDoSistema();
		Calendar dataAtual = relogio.hoje();
	}
}
