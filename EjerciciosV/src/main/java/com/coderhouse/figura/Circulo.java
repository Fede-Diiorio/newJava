package com.coderhouse.figura;

public class Circulo extends Figura {

	// constantes
	private static final double NUMERO_PI = Math.PI;

	public void calcularArea() {
		System.out.println("El área del circulo es: " + (NUMERO_PI * (getRadio() * getRadio())));
	}
}
