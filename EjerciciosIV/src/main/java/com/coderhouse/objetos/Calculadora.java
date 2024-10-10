package com.coderhouse.objetos;

public class Calculadora {

	// Atrbutos
	private int numero1;
	private int numero2;

	// Get y Set
	public int getNumero1() {
		return this.numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return this.numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public void sumar() {
		System.out.println("Número 1: " + getNumero1());
		System.out.println("Número 2: " + getNumero2());
		System.out.println("Resultado de la suma: " + (getNumero1() + getNumero2()));
	}

	public void restar() {
		System.out.println("Número 1: " + getNumero1());
		System.out.println("Número 2: " + getNumero2());
		System.out.println("Resultado de la resta: " + (getNumero1() - getNumero2()));
	}

	public void multiplicar() {
		System.out.println("Número 1: " + getNumero1());
		System.out.println("Número 2: " + getNumero2());
		System.out.println("Resultado de la multiplicación: " + (getNumero1() * getNumero2()));
	}
}
