package com.coderhouse.persona;

import java.util.Objects;

public class Persona {

	// Atributos
	private String nombre;
	private int edad;
	private int dni;

	private String mensajeDeError = "Tiene que ingresar un valor mayor a 0.";
	
	public Persona(String nombre, int edad) {
        this.nombre = nombre;
        if (edad < 0) {
            throw new IllegalArgumentException(mensajeDeError);
        } else {
        	this.edad = edad;
        }
    }

	// Get y Set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		if (dni <= 0) {
			throw new IllegalArgumentException(mensajeDeError);
		} else {
			this.dni = dni;
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad < 0) {
			throw new IllegalArgumentException(mensajeDeError);
		} else {
			this.edad = edad;
		}
	}

	// Métodos
	public void trabajar() {
		System.out.println(getNombre() + " está trabajando.");
	}

	public void validarEdad() {
		if (getEdad() < 18) {
			throw new IllegalArgumentException("Tiene que tener una edad mayor a 18");
		} else {
			System.out.println("La edad es válida.");
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Persona persona = (Persona) obj;
		return dni == persona.dni;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
}
