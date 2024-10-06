package com.coderhouse;

public class CicloFor {

	public static void main(String[] args) {
		// Ejercicio 41
		System.out.println("Ejercicio 41");

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}

		// Ejercicio 42
		System.out.println("");
		System.out.println("");
		System.out.println("Ejercicio 42");

		int sumatoria = 0;
		for (int i = 1; i <= 100; i++) {
			sumatoria += i;
		}
		System.out.println(sumatoria);

		// Ejercicio 43
		System.out.println("");
		System.out.println("Ejercicio 43");

		for (int i = 2; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		// Ejercicio 44
		System.out.println("");
		System.out.println("");
		System.out.println("Ejercicio 44");
		int arregloDeEnteros[] = { 1, 11, 44, 63, 81, 4, 16, 55, 14, 18, 43, 23 };

		for (int i = 0; i < arregloDeEnteros.length; i++) {
			System.out.print(arregloDeEnteros[i] + " ");
		}

		// Ejercicio 45
		System.out.println("");
		System.out.println("");
		System.out.println("Ejercicio 45");

		for (int i = 5; i <= 50; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}

		// Ejercicio 46
		System.out.println("");
		System.out.println("");
		System.out.println("Ejercicio 46");

		int numeroMayor = 0;

		for (int i = 0; i < arregloDeEnteros.length; i++) {
			if (numeroMayor < arregloDeEnteros[i]) {
				numeroMayor = arregloDeEnteros[i];
			}
		}

		System.out.println("El número mayor del arreglo es: " + numeroMayor);

		// Ejercicio 47
		System.out.println("");
		System.out.println("Ejercicio 47");

		int a = 0;
		int b = 1;
		int c;

		for (int i = 0; i <= 10; i++) {
			c = a + b;
			System.out.println(a);
			a = b;
			b = c;

		}

		// Ejercicio 48
		System.out.println("");
		System.out.println("Ejercicio 48");

		for (int i = 0; i < arregloDeEnteros.length; i++) {
			int resultado = arregloDeEnteros[i] * 2;
			System.out.println(resultado);
		}

		// Ejercicio 49
		System.out.println("");
		System.out.println("Ejercicio 49");

		String palabra = "Franco Colapinto";

		for (int i = 0; i < palabra.length(); i++) {
			char letra = palabra.charAt(i);
			System.out.println(letra);
		}

		// Ejercicio 50
		System.out.println("");
		System.out.println("Ejercicio 50");

		int tabla = 9;

		for (int i = 1; i <= 10; i++) {
			int resultado = tabla * i;
			System.out.println(tabla + " X " + i + " = " + resultado);
		}

	}

}
