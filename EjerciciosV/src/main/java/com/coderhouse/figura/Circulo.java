package com.coderhouse.figura;

public class Circulo extends Figura {

	public Circulo(int base, int altura, int radio) {
		super(base, altura, radio);
		// TODO Auto-generated constructor stub
	}

	// constantes
	private static final double NUMERO_PI = Math.PI;

	@Override
	public void calcularArea() {
		System.out.println("El área del circulo es: " + (NUMERO_PI * (getRadio() * getRadio())));
	}
}
