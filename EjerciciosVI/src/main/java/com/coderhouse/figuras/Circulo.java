package com.coderhouse.figuras;

public class Circulo extends FiguraGeometrica {

	// Attributes
	private double radio;

	// Constructor
	public Circulo(double radio) {
		validarRadio(radio);
		this.radio = radio;
	}

	// Methods
	private void validarRadio(double radio) {
		if (radio <= 0) {
			throw new IllegalArgumentException("El radio debe ser superior a cero.");
		}
	}

	@Override
	public double calcularArea() {
		validarRadio(radio);
		return Math.PI * (radio * radio);
	}

}
