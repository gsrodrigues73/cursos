package builder;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TesteDaNotaFiscal1CriandoNota {
	
	public static void main(String[] args) {
		List<ItemDaNota> itens = Arrays.asList(new ItemDaNota("item 1", 200), new ItemDaNota("item 2", 400));
		
		double valorBruto = 0;
		
		for (ItemDaNota item : itens) {
			valorBruto += item.getValor();
		}
		
		double impostos = valorBruto * 0.05;
		
		NotaFiscal nf = new NotaFiscal("razao social", "cnpj", Calendar.getInstance(), valorBruto, impostos, itens, "observacoes");
		
		System.out.println(nf.getValorBruto());
		
	}
}
