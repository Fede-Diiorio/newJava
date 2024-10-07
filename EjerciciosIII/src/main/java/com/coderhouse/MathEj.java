package com.coderhouse;

import java.util.List;
import java.util.ArrayList;

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

		// Ejercicio 96
		System.out.println("");
		System.out.println("Ejercicio 96");

		int dado2 = (int) (Math.random() * 6) + 1;

		if (dado + dado2 > 7) {
			System.out.println("Dado 1: " + dado);
			System.out.println("Dado 2: " + dado2);
			System.out.println("Total: " + (dado + dado2));
		} else {
			System.out.println("Dado 1: " + dado);
			System.out.println("Dado 2: " + dado2);
		}

		// Ejercicio 97
		System.out.println("");
		System.out.println("Ejercicio 97");

		List<Integer> ListaDeEnterosRandom = new ArrayList<>();

		int random1 = (int) (Math.random() * 100) + 1;
		int random2 = (int) (Math.random() * 100) + 1;
		int random3 = (int) (Math.random() * 100) + 1;
		int random4 = (int) (Math.random() * 100) + 1;
		int random5 = (int) (Math.random() * 100) + 1;
		int random6 = (int) (Math.random() * 100) + 1;
		int random7 = (int) (Math.random() * 100) + 1;
		int random8 = (int) (Math.random() * 100) + 1;
		int random9 = (int) (Math.random() * 100) + 1;
		int random10 = (int) (Math.random() * 100) + 1;

		ListaDeEnterosRandom.add(random1);
		ListaDeEnterosRandom.add(random2);
		ListaDeEnterosRandom.add(random3);
		ListaDeEnterosRandom.add(random4);
		ListaDeEnterosRandom.add(random5);
		ListaDeEnterosRandom.add(random6);
		ListaDeEnterosRandom.add(random7);
		ListaDeEnterosRandom.add(random8);
		ListaDeEnterosRandom.add(random9);
		ListaDeEnterosRandom.add(random10);

		System.out.println(ListaDeEnterosRandom);

		int buscador = ListaDeEnterosRandom.getFirst();

		for (int numero : ListaDeEnterosRandom) {
			if (buscador < numero) {
				buscador = numero;
			}
		}

		System.out.println("El número más grande es: " + buscador);

		// Ejercicio 98
		System.out.println("");
		System.out.println("Ejercicio 98");

		int randomEntre1y50 = (int) (Math.random() * 50) + 1;

		if (randomEntre1y50 >= 10 && randomEntre1y50 <= 20) {
			System.out.println("El número " + randomEntre1y50 + " se encuentra en el rango.");
		} else {
			System.out.println("Número: " + randomEntre1y50);
		}

		// Ejercicio 99
		System.out.println("");
		System.out.println("Ejercicio 99");

		int adivinado = 24;

		if (randomEntre1y50 == adivinado) {
			System.out.println("Increiblemente la pegaste: " + randomEntre1y50);
		} else {
			System.out.println("No le diste: " + randomEntre1y50);
		}

		// Ejercicio 100
		System.out.println("");
		System.out.println("Ejercicio 100");

		int contador = 0; 
		int randomNumber2; 

		do {
			randomNumber2 = (int) (Math.random() * 100) + 1; 
			contador++; 
			System.out.println("Intento " + contador + ": " + randomNumber2); 
		} while (randomNumber2 % 7 != 0);

		System.out.println("Se necesitó " + contador + " intentos para encontrar un número divisible por 7.");
	}

}
