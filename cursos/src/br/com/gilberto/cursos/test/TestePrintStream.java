package com.gilberto.cursos;

import java.io.IOException;
import java.io.PrintStream;

public class TestePrintStream {

	public static void main(String[] args) throws IOException {

		// Início do Java 1.1 era assim
		PrintStream ps = new PrintStream("codigo_ps.txt");
		
		ps.println("Teste de gravação linha 1");
//		ps.println(System.lineSeparator());
		ps.println();
		ps.println("Teste de gravação linha 2");
		
		ps.close();
		
	}
}
