package com.coderhouse.figura;

public class Figura {

	// atributos
	private int base;
	private int altura;
	private int radio;

	// Constructor

	public Figura(int base, int altura, int radio) {
		validarParametro(base);
		validarParametro(altura);
		validarParametro(radio);
		this.base = base;
		this.altura = altura;
		this.radio = radio;
	}

	private void validarParametro(int parametro) {
		String errorMenorACero = "Tiene que ingresar un número válido mayor a 0.";
		if (parametro <= 0) {
			throw new IllegalArgumentException(errorMenorACero);
		}
	}

	// GET y SET
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		validarParametro(base);
		this.base = base;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		validarParametro(radio);
		this.radio = radio;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		validarParametro(altura);
		this.altura = altura;
	}

	// Métodos
	public void calcularArea() {
		System.out.println("Aquí se calcula el area de tu figura.");
	}

	public void dibujar() {
		System.out.println("Dibujando una figura.");
	}
}
