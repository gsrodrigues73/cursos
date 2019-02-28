package com.gilberto.cursos;

import java.io.FileWriter;
import java.io.IOException;

public class TesteFileWriter1 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("codigo_fw.txt");
		
		fw.write("Teste de gravação linha 1");
//		fw.write("\r\n");
		fw.write(System.lineSeparator());
		fw.write("Teste de gravação linha 2");
		
		fw.close();
		
	}
}
