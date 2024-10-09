package com.coderhouse.objetos;

public class Vehiculo {

	// Atributos
	private int velocidad;
	private int combustible;

	// Get y Set
	public int getVelocidad() {
		return this.velocidad;
	}

	public void setVelocidad(int velocidad) throws Exception {
		String errorDeVelocidad = "La velocidad no puede ser inferior a 0.";
		if (velocidad < 0) {
			throw new Exception(errorDeVelocidad);
		} else {
			this.velocidad = velocidad;
		}
	}

	public int getCombustible() {
		return this.combustible;
	}

	public void setCombustible(int combustible) throws Exception {
		String errorDeCombustible = "El combustible ingresado no puede ser inferiror a 0";
		if (combustible < 0) {
			throw new Exception(errorDeCombustible);
		} else {
			this.combustible = combustible;
		}
	}

	public void avanzar() throws Exception {
		System.out.println("El coche tiene " + getCombustible() + " litros de combustible.");
		System.out.println("El coche avanza una hora a " + getVelocidad() + " km/h");
		int calcularRestaDeCombustible = getVelocidad() * 5 / 100;
		int restarCombustible = getCombustible() - calcularRestaDeCombustible;
		if (restarCombustible > 0) {
			System.out.println("Ahora el coche tiene " + restarCombustible + " litros de combustible.");
			setCombustible(restarCombustible);
		} else
			System.out.println("No tiene suficiente combustible para avanzar");
	}

}
