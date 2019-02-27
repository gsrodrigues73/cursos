package com.gilberto.cursos;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TesteScanner2SeparandoValoresArray {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("contas.csv"));
		
		while (sc.hasNextLine()) {
			String linha = sc.nextLine();
			System.out.println(linha);
			
			String[] valores = linha.split(",");
			System.out.println(Arrays.toString(valores));
			System.out.println(valores[3]);
			
		}
		sc.close();

	}

}
