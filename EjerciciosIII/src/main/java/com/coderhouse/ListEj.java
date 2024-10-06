package com.coderhouse;

import java.util.List;
import java.util.ArrayList;

public class ListEj {

	public static void main(String[] args) {

		// Ejercicio 11
		System.out.println("");
		System.out.println("Ejercicio 11");

		List<Integer> listaDeEnterosPrimaria = new ArrayList<>();

		listaDeEnterosPrimaria.add(21);
		listaDeEnterosPrimaria.add(17);
		listaDeEnterosPrimaria.add(24);
		listaDeEnterosPrimaria.add(19);
		listaDeEnterosPrimaria.add(14);

		System.out.println("La lista de números cargada es de: " + listaDeEnterosPrimaria);

		// Ejercicio 12
		System.out.println("");
		System.out.println("Ejercicio 12");

		listaDeEnterosPrimaria.removeFirst();

		System.out.println("La lista de números cargada es de: " + listaDeEnterosPrimaria);

		// Ejercicio 13
		System.out.println("");
		System.out.println("Ejercicio 13");

		System.out.println("El el arreglo tiene " + listaDeEnterosPrimaria.size() + " indices.");

		// Ejercicio 14
		System.out.println("");
		System.out.println("Ejercicio 14");

		int variableParaSuma = 0;

		for (int numero : listaDeEnterosPrimaria) {
			variableParaSuma += numero;
		}

		System.out.println("Los números del arreglo suman: " + variableParaSuma);

		// Ejercicio 15
		System.out.println("");
		System.out.println("Ejercicio 15");

		listaDeEnterosPrimaria.sort(null);
		System.out.println("El número más grande del arreglo es: " + listaDeEnterosPrimaria.getLast());

		// Ejercicio 16
		System.out.println("");
		System.out.println("Ejercicio 16");

		int variableAVerificar = 24;
		boolean verificador = listaDeEnterosPrimaria.contains(variableAVerificar);

		if (verificador) {
			System.out.println("El número " + variableAVerificar + " se encuentra presente dentro del arreglo.");
		} else {
			System.out.println("El número " + variableAVerificar + " NO se encuentra presente dentro del arreglo.");
		}

		// Ejercicio 17
		System.out.println("");
		System.out.println("Ejercicio 17");

		Integer[] arregloDeEnteros = listaDeEnterosPrimaria.toArray(new Integer[0]);

		System.out.println("Nuevo arreglo de enteros: ");
		for (int numero : arregloDeEnteros) {
			System.out.println(numero);
		}

		// Ejercicio 18
		System.out.println("");
		System.out.println("Ejercicio 18");

		List<String> listaDeFrutas = new ArrayList<>();

		listaDeFrutas.add("Banana");
		listaDeFrutas.add("Manzana");
		listaDeFrutas.add("Naranja");
		listaDeFrutas.add("Frutilla");
		listaDeFrutas.add("Uva");

		// Ejercicio 19
		System.out.println("");
		System.out.println("Ejercicio 19");

		for (String fruta : listaDeFrutas) {
			System.out.println(fruta);
		}

		// Ejercicio 20
		System.out.println("");
		System.out.println("Ejercicio 20");

		System.out.println(listaDeFrutas);

		listaDeFrutas.removeAll(listaDeFrutas);

		System.out.println(listaDeFrutas);
	}

}
