package com.coderhose.condicionales;

import java.util.ArrayList;
import java.util.List;

public class Condicionales {

	public static void main(String[] args) {
		// Ejercicio 1
		System.out.println("Ejercicio 1");

		int numero1 = 5;

		if (numero1 > 0) {
			System.out.println("El número " + numero1 + " es positivo.");
		} else if (numero1 < 0) {
			System.out.println("El número " + numero1 + " es negativo.");
		} else if (numero1 == 0) {
			System.out.println("El " + numero1 + " es un número neutro");
		} else {
			System.out.println("Debe ingresar un número válido");
		}

		// Ejercicio 2
		System.out.println("");
		System.out.println("Ejercicio 2");

		int edad = 19;

		if (edad >= 18) {
			System.out.println("El individuo es mayor de edad.");
		} else if (edad < 18 && edad >= 0) {
			System.out.println("El individuo es menor de edad.");
		} else if (edad < 0) {
			System.out.println("El individuo no puede ser menor a 0.");
		} else {
			System.out.println("Debe ingresar una edad válida.");
		}

		// Ejercicio 3
		System.out.println("");
		System.out.println("Ejercicio 3");

		int numero2 = 5;

		if (numero2 % 2 != 0) {
			System.out.println("El número " + numero2 + " es un número impar.");
		} else if (numero2 % 2 == 0) {
			System.out.println("El número " + numero2 + " es un número par");
		} else {
			System.out.println("Debe ingresar un número válido.");
		}

		// Ejercicio 4
		System.out.println("");
		System.out.println("Ejercicio 4");
		
		List<String> cadena1 = new ArrayList<>();
		
		if(cadena1.isEmpty()) {
			System.out.println("El arreglo se encuentra vacío");
		} else {
			System.out.println("El arreglo no se encuentra vacío");
		}
		
		cadena1.add("Carlitos");
		cadena1.add("Juan");
		cadena1.add("Javo");
		
		if(cadena1.isEmpty()) {
			System.out.println("El arreglo se encuentra vacío");
		} else {
			System.out.println("El arreglo no se encuentra vacío");
		}

	}

}
