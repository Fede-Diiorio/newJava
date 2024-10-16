package com.coderhouse.empleado;

public class programador extends Empleado {

	public programador(String nombre, int salarioPorHora) {
		super(nombre, salarioPorHora);
	}

	@Override
	public double calcularSalario() {

		return getSalarioPorHora() * 8 * 5 * 4;
	}

	@Override
	public String trabajar() {
		return getNombre() + " está trabajando como loco en un nuevo juego que va a ser GOTY.";
	}

}
