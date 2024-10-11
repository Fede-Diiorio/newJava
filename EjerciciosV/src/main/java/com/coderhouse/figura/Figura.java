package com.coderhouse.figura;

public class Figura {

	// atributos
	private int base;
	private int altura;
	private int radio;

	// variables
	String errorMenorACero = "Tiene que ingresar un número válido mayor a 0.";

	// GET y SET
	public int getBase() {
		return base;
	}

	public void setBase(int base) throws Exception {
		if (base <= 0) {
			throw new Exception(errorMenorACero);
		} else {
			this.base = base;
		}
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) throws Exception {
		if (radio <= 0) {
			throw new Exception(errorMenorACero);
		} else {
			this.radio = radio;
		}
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) throws Exception {
		if (altura <= 0) {
			throw new Exception(errorMenorACero);
		} else {
			this.altura = altura;
		}
	}

	// Métodos
	public void calcularArea() {
		System.out.println("Aquí se calcula el area de tu figura.");
	}
	
	public void dibujar() {
		System.out.println("Dibujando una figura.");
	}
}
