package com.coderhouse;

import java.util.Arrays;

public class ArraysEj {

	public static void main(String[] args) {

		// Ejercicio 1
		System.out.println("Ejercicio 1");

		int arreglo1[] = new int[5];

		arreglo1[0] = 1;
		arreglo1[1] = 2;
		arreglo1[2] = 3;
		arreglo1[3] = 4;
		arreglo1[4] = 5;

		System.out.println(arreglo1.toString());

		// Ejercicio 2
		System.out.println("");
		System.out.println("Ejercicio 2");

		int[] arregloPrimario = { 5, 17, 21, 4, 15 };
		int resultado2 = 0;

		for (int i = 0; i < arregloPrimario.length; i++) {
			resultado2 += arregloPrimario[i];
		}

		System.out.println("El resultado de la suma es: " + resultado2);

		// Ejercicio 3
		System.out.println("");
		System.out.println("Ejercicio 3");

		int resultado3 = arregloPrimario[0];

		for (int i = 0; i < arregloPrimario.length; i++) {
			if (resultado3 < arregloPrimario[i]) {
				resultado3 = arregloPrimario[i];
			}
		}

		System.out.println("El número más grande del arreglo es: " + resultado3);

		// Ejercicio 4
		System.out.println("");
		System.out.println("Ejercicio 4");

		for (int i = 0; i < arregloPrimario.length; i++) {
			if (resultado3 > arregloPrimario[i]) {
				resultado3 = arregloPrimario[i];
			}
		}

		System.out.println("El número más chico del arreglo es: " + resultado3);

		// Ejercicio 5
		System.out.println("");
		System.out.println("Ejercicio 5");

		int contador = 0;

		for (int i = 0; i < arregloPrimario.length; i++) {
			if (arregloPrimario[i] % 2 == 0) {
				contador++;
			}
		}

		System.out.println("El arreglo cuenta con " + contador + " números pares.");

		// Ejercicio 6
		System.out.println("");
		System.out.println("Ejercicio 6");

		int[] invertido = new int[arregloPrimario.length];

		for (int i = 0; i < arregloPrimario.length; i++) {
			invertido[i] = arregloPrimario[arregloPrimario.length - 1 - i];
		}

		System.out.println("Array invertido:");
		for (int numero : invertido) {
			System.out.print(numero + " ");
		}

		// Ejercicio 7
		System.out.println("");
		System.out.println("");
		System.out.println("Ejercicio 7");

		String cadena[] = { "Fiore", "Diyo", "puto" };
		for (int i = 0; i < cadena.length; i++) {
			System.out.println(cadena[i]);
		}

		// Ejercicio 8
		System.out.println("");
		System.out.println("Ejercicio 8");

		Arrays.sort(arregloPrimario);
		for (int i = 0; i < arregloPrimario.length; i++) {
			System.out.println(arregloPrimario[i]);

		}

		// Ejercicio 9
		System.out.println("");
		System.out.println("Ejercicio 9");

		int numeroBuscado = 21;
		boolean encontrado = false;

		// Recorrer el array para buscar el número
		for (int i = 0; i < arregloPrimario.length; i++) {
			if (arregloPrimario[i] == numeroBuscado) {
				System.out.println("El número " + numeroBuscado + " está en el índice: " + i);
				encontrado = true;
				break; // Salir del bucle una vez encontrado
			}
		}

		if (!encontrado) {
			System.out.println("El número " + numeroBuscado + " no está en el array.");
		}

		// Ejercicio 10
		System.out.println("");
		System.out.println("Ejercicio 10");

		System.out.println("Elementos del array en orden inverso:");
		for (int i = arregloPrimario.length - 1; i >= 0; i--) {
			System.out.println(arregloPrimario[i]);
		}
	}

}
