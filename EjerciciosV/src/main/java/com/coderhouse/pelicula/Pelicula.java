package com.coderhouse.pelicula;

import java.util.Objects;

public class Pelicula {

	// Atributos
	private String titulo;
	private String director;

	// Get y Set
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if( obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Pelicula peli = (Pelicula) obj;
		return director == peli.director;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(director);
	}

}
