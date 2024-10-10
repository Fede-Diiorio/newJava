package com.coderhouse.objetos;

public class Triangulo {

	// Atributos
	private int base;
	private int altura;

	protected static final String ERROR_DE_DATO = "Ni la base ni la altura puede ser inferior o igual a 0.";

	// Get y Set
	public int getBase() {
		return this.base;
	}

	public void setBase(int base) throws Exception {
		if (base <= 0) {
			throw new Exception(ERROR_DE_DATO);
		} else {
			this.base = base;
		}
	}

	public int getAltura() throws Exception {
		if (altura <= 0) {
			throw new Exception(ERROR_DE_DATO);
		} else {
			return this.altura;
		}
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void calcularArea() throws Exception {
		System.out.println("Base: " + getBase());
		System.out.println("Altura: " + getAltura());
		System.out.println("El area del rectangulo es: " + ((getAltura() * getBase()) / 2));
	}

	public static int calcularArea(int base, int altura) throws Exception {
		if (base <= 0 || altura <= 0) {
			throw new Exception(ERROR_DE_DATO);
		} else {
			return base * altura;
		}
	}
}
