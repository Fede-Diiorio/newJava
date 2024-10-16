package com.coderhouse.empleado;

public class Programador extends Empleado {



	public Programador(String nombre, int salarioPorHora, int identificacion) {
		super(nombre, salarioPorHora, identificacion);
		// TODO Auto-generated constructor stub
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
