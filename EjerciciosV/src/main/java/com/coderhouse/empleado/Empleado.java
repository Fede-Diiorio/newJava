package com.coderhouse.empleado;

public class Empleado {

	// Atributos
	private String empleado;
	private int sueldo;

	public Empleado(String empleado, int sueldo) {
		validarSueldo(sueldo);
		this.empleado = empleado;
		this.sueldo = sueldo;
				
	}

	private void validarSueldo(int sueldo) {
		String error = "Tiene que ingresar un salario mayor a 0.";
		if (sueldo <= 0) {
			throw new IllegalArgumentException(error);
		}
	}

	// GET y SET
	public String getEmpleado() {
		return empleado;
	}

	public void setEmpleado(String nombre) {
		this.empleado = nombre;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) throws Exception {
		validarSueldo(sueldo);
		this.sueldo = sueldo;
	}

	public void trabajar() {
		System.out.println(getEmpleado() + "está laburando como loco.");
	}
}
