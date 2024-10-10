package com.coderhouse.objetos;

public class Circulo {

	// Atributos
	private int radio;
	private int diametro;

	// constantes
	private static final float PI = 3.14159265359f;

	// variables
	String errorMenorACero = "Debe ingresar un valor mayor a 0.";

	public int getRadio() {
		return this.radio;
	}

	public void setRadio(int radio) throws Exception {
		if (radio <= 0) {
			throw new Exception(errorMenorACero);
		} else {
			this.radio = radio;
		}
	}

	public int getDiametro() {
		return this.diametro;
	}

	public void setDiametro(int diametro) throws Exception {
		if (radio <= 0) {
			throw new Exception(errorMenorACero);
		} else {
			this.diametro = diametro;
		}
	}

	public void calcularArea() {
		float area = PI * getRadio() * getRadio();
		System.out.println("El area del ciruclo mide: " + area);
	}

	public static float calcularArea(int radio) throws Exception {
		String error = "El radio tiene que se mayor a 0.";
		if (radio <= 0) {
			throw new Exception(error);
		} else {
			return PI * (radio * radio);
		}
	}

}
