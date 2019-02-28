package br.com.gilberto.cursos.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws Exception {

		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader bis = new BufferedReader(isr);
		
		String linha = bis.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = bis.readLine();
			
		}
		
		bis.close();
	}

}
