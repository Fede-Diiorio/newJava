package com.coderhouse.objetos;

public class Libro {

	// Atributos
	private String autor;
	private String Libro;

	// Getters y Setters
	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getLibro() {
		return this.Libro;
	}

	public void setLibro(String libro) {
		Libro = libro;
	}

	// Métodos
	public void imprimirDatos() {
		System.out.println("El libro " + getLibro() + " fue escrito por " + getAutor() + ".");
	}

}
