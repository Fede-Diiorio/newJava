package com.coderhouse;

public class LogicosEj {

	public static void main(String[] args) {

		// Ejercicio 81
		System.out.println("");
		System.out.println("Ejercicio 81");

		int arregloSimple[] = { 14, 16, 1, 11, -43, -63, -4, -44, 102 };

		for (int numero : arregloSimple) {
			if (numero % 2 == 0 && numero > 0) {
				System.out.println("El número " + numero + " es par y mayor a 0.");
			} else {
				System.out.println("El número " + numero + " no cumple con los requisitos.");
			}
		}

		// Ejercicio 82
		System.out.println("");
		System.out.println("Ejercicio 82");

		int edad = 18;
		boolean permiso = true;

		if (edad >= 18 || permiso == true) {
			System.out.println("La persona cumple con los requerimientos.");
		} else {
			System.out.println("Acceso denegado.");
		}

		// Ejercicio 83
		System.out.println("");
		System.out.println("Ejercicio 83");

		for (int numero : arregloSimple) {
			if (!(numero < 0)) {
				System.out.println("Número ganador: " + numero);
			}
		}

		// Ejercicio 84
		System.out.println("");
		System.out.println("Ejercicio 84");

		if (edad >= 18 && permiso == true) {
			System.out.println("Acceso permitido.");
		} else {
			System.out.println("Acceso denegado.");
		}

		// Ejercicio 85
		System.out.println("");
		System.out.println("Ejercicio 85");

		for (int numero : arregloSimple) {
			if (numero >= 10 && numero <= 20) {
				System.out.println("El número " + numero + " se encuentra dentro del rango.");
			}
		}

		// Ejercicio 86
		System.out.println("");
		System.out.println("Ejercicio 86");

		for (int numero : arregloSimple) {
			if (!(numero % 2 == 0)) {
				System.out.println("Número ganador: " + numero);
			}
		}

		// Ejercicio 87
		System.out.println("");
		System.out.println("Ejercicio 87");

		if (arregloSimple.length > 0 && arregloSimple.length > 5) {
			System.out.println("El arreglo cumple los parámetros.");
		} else {
			System.out.println("El arreglo NO cumple los requsitos.");
		}

		// Ejercicio 88
		System.out.println("");
		System.out.println("Ejercicio 88");

		for (int numero : arregloSimple) {
			if (numero % 2 == 0 || numero % 3 == 0) {
				System.out.println("El número " + numero + " cumple con los requisitos.");
			}
		}

		// Ejercicio 89
		System.out.println("");
		System.out.println("Ejercicio 89");

		int numeroParaPrueba = 14;
		int contador = 0;

		for (int numero : arregloSimple) {
			if (!(numero != numeroParaPrueba)) {
				contador++;
			}
		}

		if (contador >= 1) {
			System.out.println("La cadena contiene el valor: " + numeroParaPrueba);
		} else {
			System.out.println("La cadena NO contiene el valor: " + numeroParaPrueba);
		}

		// Ejercicio 90
		System.out.println("");
		System.out.println("Ejercicio 90");

		for (int numero : arregloSimple) {
			if (numero % 2 != 0 || numero > 100) {
				System.out.println("El número " + numero + " cumple con los requisitos.");
			}
		}

	}

}
