package com.coderhouse.figura3d;

public class Esfera extends Figura3D {

	private double radio;

	// Setter para el radio
	public void setRadio(double radio) {
		this.radio = radio;
	}

	// Getter para el radio
	public double getRadio() {
		return this.radio;
	}

	@Override
	public double volumen() {
		return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
	}

}
