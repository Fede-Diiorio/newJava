package com.coderhouse.empleado;

public class Desarrollador extends Empleado {

	public Desarrollador(String nombre, int salarioPorHora) {
		super(nombre, salarioPorHora);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String trabajar() {

		return getNombre() + " está haciendo un programa para dominar al mundo.";
	}

	@Override
	public double calcularSalario() {
		double salarioMensual = getSalarioPorHora() * 6 * 6 * 4;
		return salarioMensual;
	}

}
