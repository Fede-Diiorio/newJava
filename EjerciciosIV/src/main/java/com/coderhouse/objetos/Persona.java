package com.coderhouse.objetos;

public class Persona {

	// Constantes
	private static final int EDAD_MINIMA = 0;
	private static final int EDAD_MAXIMA = 120;

	String mensajeDeError = "La edad no puede ser menor a " + EDAD_MINIMA + " y tampoco puede ser mayor de "
			+ EDAD_MAXIMA;

	// Atributos o variables de clase
	private String nombre;
	private int edad;

	// Métodos
	public void setEdad(int edad) throws Exception {
		if (edad < EDAD_MINIMA || edad > EDAD_MAXIMA) {
			throw new Exception(mensajeDeError);
		} else {
			this.edad = edad;
		}
	}

	public void imprimirDatos() {
		System.out.println("La persona se llama " + getNombre() + " y tiene " + getEdad() + " años de edad.");
	}

	// Getters y Setters
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

}
