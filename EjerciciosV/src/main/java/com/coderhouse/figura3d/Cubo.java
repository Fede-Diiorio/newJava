package com.coderhouse.figura3d;

public class Cubo extends Figura3D {

	// Atributos
	private double lado;

	// GET y SET
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) throws Exception {
		String mensajeDeError = "Tiene que ingrear un valor mayor a 0";
		if (lado <= 0) {
			throw new Exception(mensajeDeError);
		} else {
			this.lado = lado;
		}

	}

	@Override
	public double volumen() {
		return getLado() * getLado() * getLado();
	}

}
