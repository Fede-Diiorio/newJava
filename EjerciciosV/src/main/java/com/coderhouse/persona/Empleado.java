package com.coderhouse.persona;

public class Empleado extends Persona {
	public Empleado(String nombre, int edad) {
		super(nombre, edad);
	}

	// Atributos
	private int sueldoPorHora;

	// Constantes
	private static final int HORAS_TRABAJADAS_POR_SEMANA = 48;

	// GET y SET
	public int getSueldoPorHora() {
		return sueldoPorHora;
	}

	public void setSueldoPorHora(int sueldoPorHora) throws Exception {
		String mensajeDeError = "Tiene que ingresar un valor mayor a 0.";
		if (sueldoPorHora <= 0) {
			throw new Exception(mensajeDeError);
		} else {
			this.sueldoPorHora = sueldoPorHora;
		}
	}

	// Métodos
	public void calcularSueldoMensual() {
		System.out.println("Sueldo por hora: $" + getSueldoPorHora());
		int horasPorMes = HORAS_TRABAJADAS_POR_SEMANA * 4;
		System.out.println("Horas por mes: " + horasPorMes);
		System.out.println("Total: $" + (getSueldoPorHora() * horasPorMes));
	}
}
