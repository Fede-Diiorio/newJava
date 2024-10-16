package com.coderhouse.empleado;

public class EmpleadoTiempoCompleto extends Empleado {

	public EmpleadoTiempoCompleto(String nombre, int salarioPorHora) {
		super(nombre, salarioPorHora);
		// TODO Auto-generated constructor stub
	}

	private static final int HORAS_DE_TRABAJO_POR_DIA = 8;

	@Override
	public double calcularSalario() {
		int salarioPorDia = getSalarioPorHora() * HORAS_DE_TRABAJO_POR_DIA;
		return salarioPorDia * 7 * 4;

	}

	@Override
	public String trabajar() {
		// TODO Auto-generated method stub
		return null;
	}
}
