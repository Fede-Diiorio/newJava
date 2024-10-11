package com.coderhouse.persona;

public class Persona {

	// Atriburos
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

	public void setEdad(int edad) throws Exception {
		String errorDeEdad = "La idad no puede ser menor a 0.";
		if (edad < 0) {
			throw new Exception(errorDeEdad);
		} else {
			this.edad = edad;
		}
	}

	// Métodos
	public void trabajar() {
		System.out.println(getNombre() + " está trabajando.");
	}

}
