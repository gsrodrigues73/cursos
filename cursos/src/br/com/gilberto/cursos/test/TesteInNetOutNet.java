package com.gilberto.cursos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteInNetOutNet {

	public static void main(String[] args) throws IOException {
		
		Socket skt = new Socket();
		
		// Fluxo de entrada pela rede usando o socket
		InputStream fis = skt.getInputStream();
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		// Fluxo de saída pela rede usando o socket
		OutputStream fos = skt.getOutputStream();
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
		
		skt.close();
		bw.close();
		br.close();
	}

}
