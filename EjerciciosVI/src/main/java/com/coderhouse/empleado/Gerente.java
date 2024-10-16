package com.coderhouse.empleado;

public class Gerente extends Empleado {

	public Gerente(String nombre, int salarioPorHora) {
		super(nombre, salarioPorHora);
	}

	@Override
	public double calcularSalario() {
		return getSalarioPorHora() * 6 * 5 * 4;
	}

	@Override
	public String trabajar() {
		return getNombre() + " está haciendo cosas importantes para el correcto funcionamiento de la empresa.";
	}

}
