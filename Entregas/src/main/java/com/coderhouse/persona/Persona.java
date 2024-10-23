package com.coderhouse.persona;

public class Persona {

	// Attributes
	private String nombre;
	private String apellido;

	// Constructor
	public Persona(String nombre, String apellido) {
		this.apellido = apellido;
		this.nombre = nombre;
	}

	// GET y SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	// Methods
	public String nombreCompleto() {
		return getNombre() + " " + getApellido();
	}

}
