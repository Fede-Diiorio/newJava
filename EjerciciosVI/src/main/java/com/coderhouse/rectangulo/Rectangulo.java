package com.coderhouse.rectangulo;

public class Rectangulo {

	// Atributos
	private int base;
	private int altura;

	// Constructor
	public Rectangulo(int base, int altura) {
		validarBaseYAltura(base, altura);
		this.base = base;
		this.altura = altura;
	}

	// Métodos
	private void validarBaseYAltura(int base, int altura) {
		if (base <= 0 || altura <= 0) {
			throw new IllegalArgumentException("La base y la altura deben ser número mayores a cero.");
		}
	}
	
	private void validarBaseYAltura(float base, float altura) {
		if (base <= 0 || altura <= 0) {
			throw new IllegalArgumentException("La base y la altura deben ser número mayores a cero.");
		}
	}
	
	private void validarBaseYAltura(double base, double altura) {
		if (base <= 0 || altura <= 0) {
			throw new IllegalArgumentException("La base y la altura deben ser número mayores a cero.");
		}
	}

	private void validarParametro(int parametro) {
		if (parametro <= 0) {
			throw new IllegalArgumentException("Debe ingresar un número mayor a cero..");
		}
	}
	
	public void calcularArea() {
		int resultado = getBase() * getAltura();
		System.out.println("El area del rectangulo es de: " + resultado);
	}
	
	public void calcularArea(float base, float altura) {
		validarBaseYAltura(base, altura);
		float resultado = base * altura;
		System.out.println("El area del rectangulo es de: " + resultado);
	}

	public void calcularArea(double base, double altura) {
		validarBaseYAltura(base, altura);
		double resultado = base * altura;
		System.out.println("El area del rectangulo es de: " + resultado);
	}
	
	// GET y SET
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		validarParametro(base);
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		validarParametro(altura);
		this.altura = altura;
	}

}
