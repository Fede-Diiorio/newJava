package com.coderhouse.electrodomestico;

public class Lavadora extends Electrodomestico {

	// Atributos
	private String programaDeLavado;

	// GET y SET
	public String getProgramaDeLavado() {
		return programaDeLavado;
	}

	public void setProgramaDeLavado(String programaDeLavado) {
		this.programaDeLavado = programaDeLavado;
	}

	@Override
	public void encender() {
		System.out.println("La lavadora se ha encendido en el programa: " + getProgramaDeLavado());
	}
}
