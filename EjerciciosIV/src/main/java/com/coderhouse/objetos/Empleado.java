package com.coderhouse.objetos;

public class Empleado {

	// Atributos
	private String nombre;
	private int sueldo;

	// Constates
	private static final int SALARIO_MINIMO = 2000;
	private static final int HORAS_TRABAJO = 192; // Cada mes

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

	public void validarSueldo() {
		if (SALARIO_MINIMO < getSueldo()) {
			System.out.println("Tu salario está aprobado por los cruzados de Miller.");
		} else {
			System.out.println("Deberías pedir un aumento.");
		}
	}

	// Métodos
	public void calcularSueldoAnual() {
		int calcularAnual = getSueldo() * 12;
		System.out.println("El sueldo anual de " + getNombre() + " es de: $" + calcularAnual);
	}

	public void calcularSueldoSemanal() {
		int calcularSemanal = 48 * getSueldo() / HORAS_TRABAJO;
		System.out.println("El sueldo semanal de " + getNombre() + " es de: $" + calcularSemanal);
	}

}
