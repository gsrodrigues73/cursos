package com.gilberto.cursos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteScanner3SeparandoValoresScanner {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("contas.csv"));
		
		while (sc.hasNextLine()) {
			String linha = sc.nextLine();
			System.out.println(linha);

			Scanner scLinha = new Scanner(linha);
			scLinha.useDelimiter(",");
			
			String valor1 = scLinha.next();
			String valor2 = scLinha.next();
			String valor3 = scLinha.next();
			String valor4 = scLinha.next();
			String valor5 = scLinha.next();
			
			System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
			
			scLinha.close();
		}
		sc.close();

	}

}
