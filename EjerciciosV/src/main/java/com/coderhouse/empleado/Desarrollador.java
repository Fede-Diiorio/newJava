package com.coderhouse.empleado;

public class Desarrollador extends Empleado {

	@Override
	public void trabajar() {
		System.out.println(getEmpleado() + "está laburando tranca y encima está ganando una fortuna.");
	}
}
