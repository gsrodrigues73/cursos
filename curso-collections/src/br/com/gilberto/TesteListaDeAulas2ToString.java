package br.com.gilberto;

import java.util.ArrayList;

public class TesteListaDeAulas2ToString {
	
	public static void main(String[] args) {
		// Listas de objetos
		Aula a1 = new Aula("Revisitando as Arraylists", 21);
		Aula a2 = new Aula("Listas de Objetos", 15);
		Aula a3 = new Aula("Relacionamento de Listas e Objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
//		aulas.add("Equals e Hascode"); // erro
		
		System.out.println(aulas);
		
	}
}
