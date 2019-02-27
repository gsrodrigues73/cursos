package com.gilberto.cursos;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner4Formatacao {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("contas.csv"));
		
		while (sc.hasNextLine()) {
			String linha = sc.nextLine();
			System.out.println(linha);

			Scanner scLinha = new Scanner(linha);
			scLinha.useDelimiter(",");
			scLinha.useLocale(Locale.US);			// Define regras de pontuação
			
			String valor1 = scLinha.next();
			int valor2 = scLinha.nextInt();
			int valor3 = scLinha.nextInt();
			String valor4 = scLinha.next();
			double valor5 = scLinha.nextDouble();	// Sem identificar o ponto decimal, essa linha vai dar erro
			
//			System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
			String formatado = String.format("%s", "joe");
//			System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
			
			scLinha.close();
		}
		sc.close();

	}

}
