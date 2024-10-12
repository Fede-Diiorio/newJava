package com.coderhouse.objetos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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

	public void leerArchivo(String rutaArchivo) throws FileNotFoundException {
		File archivo = new File(rutaArchivo);

		// Verificar si el archivo existe
		if (!archivo.exists()) {
			throw new FileNotFoundException("El archivo no existe: " + rutaArchivo);
		}

		// Si existe, leer el archivo (opcional, para mostrar contenido)
		Scanner scanner = new Scanner(archivo);
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}

}
