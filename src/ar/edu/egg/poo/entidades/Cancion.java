package ar.edu.egg.poo.entidades;

public class Cancion {
	private String titulo;
	private String autor;

	public Cancion() {
		this("", "");
	}

	public Cancion(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}
}
