package br.com.gilberto.cursos.test;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner4Formatacao {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("contas.csv"));
		
		while (sc.hasNextLine()) {
			String linha = sc.nextLine();

			Scanner scLinha = new Scanner(linha);
			scLinha.useDelimiter(",");
			scLinha.useLocale(Locale.US);			// Define regras de pontuação
			
			String valor1 = scLinha.next();
			int valor2 = scLinha.nextInt();
			int valor3 = scLinha.nextInt();
			String valor4 = scLinha.next();
			double valor5 = scLinha.nextDouble();	// Sem identificar o ponto decimal, essa linha vai dar erro
//			System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
			
//			String valorFormatado = String.format("%s %s %s %s %s", valor1, valor2, valor3, valor4, valor5);
			
			Integer v2 = new Integer(valor2);
			Integer v3 = new Integer(valor3);
			Double v5 = new Double(valor5);
			Object[] valores = {valor1, v2, v3, valor4, v5};
			// O parâmetro Locale.US indica o idioma
//			String valorFormatado = String.format(Locale.US, "%s - %04d-%08d, %20s: %08.2f", valores);
//			String valorFormatado = String.format(new Locale("pt"),"%s - %04d-%08d, %20s: %08.2f", valores);
//			String valorFormatado = String.format("%s - %04d-%08d, %20s: %08.2f", valores);
//			System.out.println(valorFormatado);
			
			System.out.format("%s - %04d-%08d, %20s: %08.2f %n", valores);
			
			
			scLinha.close();
		}
		sc.close();

	}

}
