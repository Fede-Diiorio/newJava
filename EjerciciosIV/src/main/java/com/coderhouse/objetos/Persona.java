package com.coderhouse.objetos;

public class Persona {

	// Constantes
	private static final int EDAD_MINIMA = 0;
	private static final int EDAD_MAXIMA = 120;
	private static final int ANIO_ACTUAL = 2024;

	private String errorConLaEdad = "La edad no puede ser menor a " + EDAD_MINIMA + " y tampoco puede ser mayor de "
			+ EDAD_MAXIMA;

	private String casteo = " ha casteado un hechizo.";

	// Atributos o variables de clase
	private String nombre;
	private int edad;

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

	// Métodos
	public void setEdad(int edad) throws Exception {
		if (edad < EDAD_MINIMA || edad > EDAD_MAXIMA) {
			throw new Exception(errorConLaEdad);
		} else {
			this.edad = edad;
		}
	}

	public void imprimirDatos() {
		System.out.println("La persona se llama " + getNombre() + " y tiene " + getEdad() + " años de edad.");
	}

	public void saludar() {
		System.out.println(getNombre() + " te manda un saludo.");
	}

	public void esMayorDeEdad() {
		if (getEdad() >= 18) {
			System.out.println(getNombre() + " es mayor de edad.");
		} else {
			System.out.println(getNombre() + " NO es mayor de edad.");
		}
	}

	public void castearHechizo() {
		System.out.println(getNombre() + casteo);
	}

	public void calcularEdad(int anioDeNacimiento) throws Exception {
		String errorDeAnio = "No puede ingresar un año superior al año actual o un año negativo.";
		if (anioDeNacimiento > ANIO_ACTUAL || anioDeNacimiento < 0) {
			throw new Exception(errorDeAnio);
		} else {
			int edad = ANIO_ACTUAL - anioDeNacimiento;
			if (edad > EDAD_MAXIMA) {
				throw new Exception(errorConLaEdad);
			} else {
				System.out.println("Usted tiene " + edad + " años de edad.");
			}
		}
	}

	public void imprimirNombre(String nombre) {
		System.out.println("La persona se llama " + nombre);
	}

	public boolean esMayorDeEdad(int edad) throws Exception {
		if (edad < EDAD_MINIMA || edad > EDAD_MAXIMA) {
			throw new Exception(errorConLaEdad);
		} else {
			return edad >= 18;
		}
	}

}
