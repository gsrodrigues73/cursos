package com.gilberto.cursos;

import java.io.IOException;
import java.io.PrintWriter;

public class TestePrintWriter {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("codigo_pw.txt");
		
		pw.println("Teste de gravação linha 1");
//		ps.println(System.lineSeparator());
		pw.println();
		pw.println("Teste de gravação linha 2");
		
		pw.close();
		
	}
}
