package com.coderhouse.libro;

import java.util.Objects;

public class Libro {

	// atributos
	private String isbn;
	private String titulo;
	private String autor;

	public Libro(String titulo, String autor) {
		this.autor = autor;
		this.titulo = titulo;
	}
	
	// GET y SET
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        Libro persona = (Libro) obj;
	        return isbn == persona.isbn;  
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(isbn);  
	    }

}
