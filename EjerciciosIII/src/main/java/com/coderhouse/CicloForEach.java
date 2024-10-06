package com.coderhouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class CicloForEach {

	public static void main(String[] args) {

		// Ejercicio 51
		System.out.println("");
		System.out.println("Ejercicio 51");

		List<Integer> arregloDeEnterosPrimario = new ArrayList<>();

		arregloDeEnterosPrimario.add(23);
		arregloDeEnterosPrimario.add(43);
		arregloDeEnterosPrimario.add(44);
		arregloDeEnterosPrimario.add(63);
		arregloDeEnterosPrimario.add(1);
		arregloDeEnterosPrimario.add(11);
		arregloDeEnterosPrimario.add(81);
		arregloDeEnterosPrimario.add(4);
		arregloDeEnterosPrimario.add(16);
		arregloDeEnterosPrimario.add(55);
		arregloDeEnterosPrimario.add(14);
		arregloDeEnterosPrimario.add(18);

		System.out.println(arregloDeEnterosPrimario);

		for (int numero : arregloDeEnterosPrimario) {
			System.out.print(numero + " ");
		}
		System.out.println("");

		// Ejercicio 52
		System.out.println("");
		System.out.println("Ejercicio 52");

		List<String> arregloDeCadenaPrimario = new ArrayList<String>();

		arregloDeCadenaPrimario.add("Colapinto");
		arregloDeCadenaPrimario.add("Albon");
		arregloDeCadenaPrimario.add("Hamilton");
		arregloDeCadenaPrimario.add("Russell");
		arregloDeCadenaPrimario.add("Verstappen");
		arregloDeCadenaPrimario.add("Checo");
		arregloDeCadenaPrimario.add("Piastri");
		arregloDeCadenaPrimario.add("Norris");
		arregloDeCadenaPrimario.add("Leclerc");
		arregloDeCadenaPrimario.add("Sainz");
		arregloDeCadenaPrimario.add("Alonso");
		arregloDeCadenaPrimario.add("Stroll");

		for (String nombre : arregloDeCadenaPrimario) {
			System.out.println(nombre);
		}

		// Ejercicio 53
		System.out.println("");
		System.out.println("Ejercicio 53");

		int resultado = 0;
		for (int numero : arregloDeEnterosPrimario) {
			resultado += numero;
		}

		System.out.println(resultado);

		// Ejercicio 54
		System.out.println("");
		System.out.println("Ejercicio 54");

		for (int numero : arregloDeEnterosPrimario) {
			int producto = numero * 3;
			System.out.println(producto);
		}

		// Ejercicio 55
		System.out.println("");
		System.out.println("Ejercicio 55");

		for (int numero : arregloDeEnterosPrimario) {
			if (numero % 2 == 0) {
				System.out.println(numero);
			}
		}

		// Ejercicio 56
		System.out.println("");
		System.out.println("Ejercicio 56");

		for (String nombre : arregloDeCadenaPrimario) {
			if (nombre.length() > 5) {
				System.out.println(nombre);
			}
		}

		// Ejercicio 57
		System.out.println("");
		System.out.println("Ejercicio 57");

		int arregloNegativo[] = { 1, 2, 3, -4, 5, -6, 7, 8, -9 };
		int contadorNegativo = 0;

		for (int numero : arregloNegativo) {
			if (numero < 0) {
				contadorNegativo++;
			}
		}

		System.out.println("El arreglo " + arregloNegativo + " tiene " + contadorNegativo + " números negativos.");

		// Ejercicio 58
		System.out.println("");
		System.out.println("Ejercicio 58");

		System.out.println("PENDIENTE");

		// Ejercicio 59
		System.out.println("");
		System.out.println("Ejercicio 59");
		
		StringBuilder concat = new StringBuilder();		
		
		for(String nombre : arregloDeCadenaPrimario) {
			concat.append(nombre).append(" - ");
		}
		
		System.out.println(concat);

	}

}
