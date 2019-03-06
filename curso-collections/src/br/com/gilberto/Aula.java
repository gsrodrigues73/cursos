package br.com.gilberto;

// interface incluída para TesteListaDeAulas3Sort
public class Aula implements Comparable<Aula> {

	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	
	// criado para TesteListaDeAulas2ToString
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
	}

	// criado para TesteListaDeAulas3Sort
	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
	
}
