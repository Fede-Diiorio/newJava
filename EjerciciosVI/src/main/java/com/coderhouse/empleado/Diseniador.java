package com.coderhouse.empleado;

public class Diseniador extends Empleado {

	public Diseniador(String nombre, int salarioPorHora) {
		super(nombre, salarioPorHora);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalario() {
		double salarioMensual = getSalarioPorHora() * 6 * 7 * 4;
		return salarioMensual;
	}

	@Override
	public String trabajar() {
		return getNombre() + " está diseñando un sitio para Coderhouse.";
	}

}
