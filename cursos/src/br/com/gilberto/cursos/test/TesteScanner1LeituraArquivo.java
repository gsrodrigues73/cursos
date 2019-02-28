package com.gilberto.cursos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteScanner1LeituraArquivo {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(new File("contas.csv"));
		
		while (sc.hasNextLine()) {
			String linha = sc.nextLine();
			System.out.println(linha);
			
		}
		sc.close();
		
	}

}
