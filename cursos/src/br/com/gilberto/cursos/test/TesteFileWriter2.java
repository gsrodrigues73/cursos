package br.com.gilberto.cursos.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteFileWriter2 {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("codigo_fw.txt"));
		bw.write("Teste de gravação linha 1");
//		fw.write("\r\n");
		bw.write(System.lineSeparator());
		bw.write("Teste de gravação linha 2");
		
		bw.close();
		
	}
}
