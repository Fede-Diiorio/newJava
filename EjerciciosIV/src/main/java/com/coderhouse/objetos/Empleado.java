package com.coderhouse.objetos;

public class Empleado {

	// Atributos
	private String nombre;
	private int sueldo;

	// Get y Set
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(int sueldo) throws Exception {
		String errorDeSueldo = "El salario ingresado no puede ser 0 ni inferior a 0";
		if (sueldo <= 0) {
			throw new Exception(errorDeSueldo);
		} else {
			this.sueldo = sueldo;
		}
	}

	// Métodos
	public void calcularSueldoAnual() {
		int calcularAnual = getSueldo() * 12;
		System.out.println("El sueldo anual de " + getNombre() + " es de: $" + calcularAnual);
	}

}
