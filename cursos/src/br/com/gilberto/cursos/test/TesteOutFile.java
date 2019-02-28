package com.gilberto.cursos;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteOutFile {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de saída pelo arquivo usando FileOutputStream
//		FileOutputStream fos = new FileOutputStream("codigo_out.txt");
		OutputStream fos = new FileOutputStream("codigo_out.txt");
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Teste de gravação linha 1");
		bw.newLine();
		bw.write("Teste de gravação linha 2");
		bw.newLine();
		bw.write("Teste de gravação linha 3");
		bw.newLine();
		bw.write("Teste de gravação linha 4");
		
		bw.close();
		
	}
}
