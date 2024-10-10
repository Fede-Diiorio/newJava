package com.coderhouse.objetos;

public class Vehiculo {

	// Atributos
	private int velocidad;
	private int combustible;
	private int consumoCada100km;

	// Get y Set
	public int getConsumoCada100km() {
		return this.consumoCada100km;
	}

	public void setConsumoCada100km(int consumoCada100km)throws Exception {
		String errorDeCombustible = "El coche no puede consumir 0 listros de combustible ni una cantidad inferior a eso.";
		if(consumoCada100km <= 0) {
			throw new Exception(errorDeCombustible);
		} else {
			this.consumoCada100km = consumoCada100km;
		}
	}

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
		int calcularRestaDeCombustible = getVelocidad() * getConsumoCada100km() / 100;
		int restarCombustible = getCombustible() - calcularRestaDeCombustible;
		if (restarCombustible > 0) {
			System.out.println("Ahora el coche tiene " + restarCombustible + " litros de combustible.");
			setCombustible(restarCombustible);
		} else
			System.out.println("No tiene suficiente combustible para avanzar");
	}
	
	public void calcularCombustible(int distancia) throws Exception{
		String sinDistancia = "La distancia debe ser mayor a 0.";
		if(distancia < 0) {
			throw new Exception(sinDistancia);
		} else {
			float calculoDeConsumo = distancia * getConsumoCada100km() / 100;
 			System.out.println("Para recorrer " + distancia + " km necesita " + calculoDeConsumo + " litros de combustible");
		}
	}
	
}
