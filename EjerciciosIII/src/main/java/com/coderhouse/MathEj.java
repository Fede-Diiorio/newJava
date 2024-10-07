package com.coderhouse;

public class MathEj {

	public static void main(String[] args) {
		// Ejercicio 91
		System.out.println("");
		System.out.println("Ejercicio 91");

		double numeroRandomChiquito = Math.random();

		if (numeroRandomChiquito > 0.5) {
			System.out.println("El número " + numeroRandomChiquito + " cumple.");
		} else {
			System.out.println(numeroRandomChiquito + " no cumple.");
		}

		// Ejercicio 92
		System.out.println("");
		System.out.println("Ejercicio 92");

		int dado = (int) (Math.random() * 6) + 1;

		System.out.println(dado);

		// Ejercicio 93
		System.out.println("");
		System.out.println("Ejercicio 93");

		int numeroRandomEntre1y100 = (int) (Math.random() * 100) + 1;

		if (numeroRandomEntre1y100 % 2 == 0) {
			System.out.println("El número generado es " + numeroRandomEntre1y100 + " y es par.");
		} else {
			System.out.println("El número generado es " + numeroRandomEntre1y100 + " y es impar.");
		}

		// Ejercicio 94
		System.out.println("");
		System.out.println("Ejercicio 94");

		int moneda = (int) (Math.random() * 2) + 1;

		if (moneda == 1) {
			System.out.println("Cara");
		} else if (moneda == 2) {
			System.out.println("Seca");
		}

		// Ejercicio 95
		System.out.println("");
		System.out.println("Ejercicio 95");

		int randomNumber = (int) (Math.random() * 101) - 50;
		System.out.println("El número generado es: " + randomNumber);

		if (randomNumber > 0) {
			System.out.println("El número es positivo.");
		} else if (randomNumber < 0) {
			System.out.println("El número es negativo.");
		} else {
			System.out.println("El número es cero.");
		}
	}

}
