package com.coderhouse.animal;

public class Animal {

	// Atributos
	private String nombre;
	private int edad;

	// Get y Set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Metodos
	public void hacerSonido() {
		System.out.println(getNombre() + " está haciendo un sonido");
	}
	
	public void alimentarse() {
		System.out.println(getNombre() + " se está alimentando.");
	}
	
	public void moverse() {
		System.out.println(getNombre() + " está avanzando.");
	}
}
