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

	public void sumarLocal(int numero1, int numero2) {
		System.out.println("Número 1: " + numero1);
		System.out.println("Número 2: " + numero2);
		System.out.println("Resultado de la suma: " + (numero1 + numero2));
	}

	public void restar() {
		System.out.println("Número 1: " + getNumero1());
		System.out.println("Número 2: " + getNumero2());
		System.out.println("Resultado de la resta: " + (getNumero1() - getNumero2()));
	}

	public void multiplicar() {
		String cartel = "Resultado de la multiplicación: ";
		System.out.println("Número 1: " + getNumero1());
		System.out.println("Número 2: " + getNumero2());
		System.out.println(cartel + (getNumero1() * getNumero2()));
	}

	public void dividir() throws Exception {
		String cartel = "Resultado de la división: ";
		String error = "El número 2 no tiene que ser diferente de 0";
		System.out.println("Número 1: " + getNumero1());
		System.out.println("Número 2: " + getNumero2());
		if (getNumero2() == 0) {
			throw new Exception(error);
		} else {
			System.out.println(cartel + (getNumero1() / getNumero2()));
		}
	}

	public static int sumar(int numero1, int numero2) {
		return numero1 + numero2;
	}

	public static int restar(int numero1, int numero2) {
		return numero1 - numero2;
	}

	public static int multiplicar(int numero1, int numero2) {
		return numero1 * numero2;
	}
}
