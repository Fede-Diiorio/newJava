package com.coderhouse.empleado;

public class Empleado {

	// Atributos
	private String empleado;
	private int sueldo;

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
		String error = "Tiene que ingresar un salario mayor a 0.";
		if (sueldo <= 0) {
			throw new Exception(error);
		} else {
			this.sueldo = sueldo;
		}
	}
	
	public void trabajar() {
		System.out.println(getEmpleado() + "está laburando como loco.");
	}
}
