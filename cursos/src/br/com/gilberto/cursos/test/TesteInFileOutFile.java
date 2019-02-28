package com.gilberto.cursos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteInFileOutFile {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada pelo arquivo usando FileInputStream
		InputStream fis = new FileInputStream("codigo.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		// Fluxo de saída pelo arquivo usando FileOutputStream
		OutputStream fos = new FileOutputStream("codigo_out.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();
		
		while(linha != null) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}
		
		bw.close();
		br.close();
	}

}
