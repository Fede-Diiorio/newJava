package com.coderhouse.objetos;

public class Vehiculo {

	// Atributos protegidos
	protected int velocidad;
	private int combustible;
	private int consumoCada100km;

	// constantes
	private static final int MAX_VELOCIDAD = 140;

	// Get y Set
	public int getConsumoCada100km() {
		return this.consumoCada100km;
	}

	public void setConsumoCada100km(int consumoCada100km) throws Exception {
		String errorDeCombustible = "El coche no puede consumir 0 litros de combustible ni una cantidad inferior a eso.";
		if (consumoCada100km <= 0) {
			throw new Exception(errorDeCombustible);
		} else {
			this.consumoCada100km = consumoCada100km;
		}
	}

	public int getCombustible() {
		return this.combustible;
	}

	public void setCombustible(int combustible) throws Exception {
		String errorDeCombustible = "El combustible ingresado no puede ser inferior a 0.";
		if (combustible < 0) {
			throw new Exception(errorDeCombustible);
		} else {
			this.combustible = combustible;
		}
	}

	public void setVelocidad(int velocidad) throws Exception {
		String errorDeVelocidad = "La velocidad no puede ser inferior a 0.";
		if (velocidad < 0) {
			throw new Exception(errorDeVelocidad);
		} else {
			this.velocidad = velocidad;
		}
	}

	// Métodos
	public void mostrarVelocidad() {
		System.out.println("La velocidad actual es: " + velocidad + " km/h");
	}

	public void avanzar() throws Exception {
		System.out.println("El coche tiene " + getCombustible() + " litros de combustible.");
		System.out.println("El coche avanza una hora a " + velocidad + " km/h");
		int calcularRestaDeCombustible = velocidad * getConsumoCada100km() / 100;
		int restarCombustible = getCombustible() - calcularRestaDeCombustible;
		if (restarCombustible > 0) {
			System.out.println("Ahora el coche tiene " + restarCombustible + " litros de combustible.");
			setCombustible(restarCombustible);
		} else {
			System.out.println("No tiene suficiente combustible para avanzar.");
		}
		if (velocidad > MAX_VELOCIDAD) {
			System.out.println("Ha sido multado por exceso de velocidad.");
		}
	}

	public void frenar() throws Exception {
		setVelocidad(0);
		System.out.println("El auto ahora se encuentra detenido.");
	}

	public void calcularCombustible(int distancia) throws Exception {
		String sinDistancia = "La distancia debe ser mayor a 0.";
		if (distancia < 0) {
			throw new Exception(sinDistancia);
		} else {
			float calculoDeConsumo = distancia * getConsumoCada100km() / 100;
			System.out.println(
					"Para recorrer " + distancia + " km necesita " + calculoDeConsumo + " litros de combustible.");
		}
	}

	public void calcularCombustible2(int distancia, int consumo) throws Exception {
		String errorDeConsumo = "El consumo no puede ser 0 o inferior a 0. Nosotros nos regimos con las leyes de la termodinamica.";
		if (consumo <= 0) {
			throw new Exception(errorDeConsumo);
		} else {
			int distanciaReal = Math.abs(distancia);
			int consumoTotal = distanciaReal * consumo;

			System.out.println("En una distancia de " + distanciaReal + " km, el vihículo gastó " + consumoTotal
					+ " litros de combustible.");
		}
	}

	public int calcularCombustibleReturn(int distancia, int consumo) throws Exception {
		String errorDeConsumo = "El consumo no puede ser 0 o inferior a 0. Nosotros nos regimos con las leyes de la termodinamica.";
		if (consumo <= 0) {
			throw new Exception(errorDeConsumo);
		} else {
			int distanciaReal = Math.abs(distancia);
			int consumoTotal = distanciaReal * consumo;

			System.out.println("En una distancia de " + distanciaReal + " km, el vihículo gastó " + consumoTotal
					+ " litros de combustible.");

			return consumoTotal;
		}
	}
}
