package com.coderhouse.persona;

import java.util.Objects;

public class Persona {

	// Atributos
	private String nombre;
	private int edad;

	// Constructores sobrecargados
	public Persona(String nombre, int edad) {
		validarEdad(edad);
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(String nombre) {
		this.nombre = nombre;
		this.edad = 0;
	}

	// Método de validación unificado
	private void validarEdad(int edad) {
		if (edad <= 0) {
			throw new IllegalArgumentException("Tiene que ingresar una edad mayor a cero.");
		}
	}

	// Methods

	public void imprimirDetalles() {
		System.out.println("Nombre: " + nombre + ", Edad: " + edad);
	}

	public void imprimirDetalles(String prefijo) {
		System.out.println(prefijo + " Nombre: " + nombre + ", Edad: " + edad);
	}

	public void imprimirDetalles(String prefijo, String sufijo) {
		System.out.println(prefijo + " Nombre: " + nombre + ", Edad: " + edad + " " + sufijo);
	}

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
		validarEdad(edad);
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}

}
