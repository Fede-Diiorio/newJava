package com.coderhouse.circulo;

public class Circulo {
	
	private static final double NUMERO_PI = Math.PI;
	
	private void validarRadio(int radio) {
		if(radio <= 0) {
			throw new IllegalArgumentException("El radio debe ser mayor a cero.");
		}
	}
	private void validarRadio(double radio) {
		if(radio <= 0) {
			throw new IllegalArgumentException("El radio debe ser mayor a cero.");
		}
	}

	public void calcularArea(int radio) {
		validarRadio(radio);
		double resultado = NUMERO_PI * radio * radio;
		System.out.println("El area del circulo es: " + resultado);
	}
	
	public void calcularArea(double radio) {
		validarRadio(radio);
		double resultado = NUMERO_PI * radio * radio;
		System.out.println("El area del circulo es: " + resultado);
	}
}
