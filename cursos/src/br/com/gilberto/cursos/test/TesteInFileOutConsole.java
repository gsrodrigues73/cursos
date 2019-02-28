package com.gilberto.cursos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteInFileOutConsole {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de entrada pelo arquivo usando FileInputStream
//		FileInputStream fis = new FileInputStream("codigo.txt");
		InputStream fis = new FileInputStream("codigo.txt");
//		InputStreamReader isr = new InputStreamReader(fis);
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		br.close();
		
	}
}
