package com.coderhouse.empleado;

public class Desarrollador extends Empleado {

	public Desarrollador(String empleado, int sueldo) {
		super(empleado, sueldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trabajar() {
		System.out.println(getEmpleado() + "está laburando tranca y encima está ganando una fortuna.");
	}
}
