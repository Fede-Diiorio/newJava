package com.coderhouse.integracion.ejercicio37;

public class Main {

	public static void main(String[] args) {
		Calculadora figura1 = new Calculadora(5, 5);
		Calculadora figura2 = new Calculadora(5, -5);

		figura1.sumarNumeros();
		figura1.restarNumeros();
		figura1.multiplicarNumeros();
		figura1.dividirNumeros();

		System.out.println("-----");

		figura2.sumarNumeros();
		figura2.restarNumeros();
		figura2.multiplicarNumeros();
		figura2.dividirNumeros();

	}

}
