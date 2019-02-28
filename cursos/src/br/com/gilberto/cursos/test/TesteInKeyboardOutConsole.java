package br.com.gilberto.cursos.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteInKeyboardOutConsole {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de entrada pelo teclado usando o System.in
		InputStream fis = System.in;
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		// Fluxo de saída pelo console usando System.out
		OutputStream fos = System.out;
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();
		
		// Foi necessário criar esta crítica para terminar o pgm
		// quando o usuário inserir uma linha em branco
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();	// Descarrega o buffer
			linha = br.readLine();
		}
		
		bw.close();
		br.close();
	}

}
