package com.coderhouse;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEj {

	public static void main(String[] args) {

		// Ejercicio 31
		System.out.println("");
		System.out.println("Ejercicio 31");

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

		Iterator<Integer> iteratorInteger = arregloDeEnterosPrimario.iterator();

		while (iteratorInteger.hasNext()) {
			int variable = iteratorInteger.next();
			System.out.println(variable);
		}

		// Ejercicio 32
		System.out.println("");
		System.out.println("Ejercicio 32");

		iteratorInteger = arregloDeEnterosPrimario.iterator();

		while (iteratorInteger.hasNext()) {
			int variable = iteratorInteger.next();
			if (variable % 2 != 0) {
				iteratorInteger.remove();
			}
		}

		System.out.println(arregloDeEnterosPrimario);

		// Ejercicio 33
		System.out.println("");
		System.out.println("Ejercicio 33");

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

		Iterator<String> iteratorString = arregloDeCadenaPrimario.iterator();

		while (iteratorString.hasNext()) {
			String variable = iteratorString.next();
			System.out.println(variable);
		}

		// Ejercicio 34
		System.out.println("");
		System.out.println("Ejercicio 34");

		int contador = 0;

		iteratorString = arregloDeCadenaPrimario.iterator();

		while (iteratorString.hasNext()) {
			iteratorString.next();
			contador++;
		}

		System.out.println("El arreglo tiene cargados " + contador + " valores.");

		// Ejercicio 35
		System.out.println("");
		System.out.println("Ejercicio 35");

		iteratorString = arregloDeCadenaPrimario.iterator();

		while (iteratorString.hasNext()) {
			String nombre = iteratorString.next();

			char letra = Character.toLowerCase(nombre.charAt(0));
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				iteratorString.remove();
			}

		}
		System.out.println(arregloDeCadenaPrimario);

		// Ejercicio 36
		System.out.println("");
		System.out.println("Ejercicio 36");

		iteratorInteger = arregloDeEnterosPrimario.iterator();
		contador = 0;

		while (iteratorInteger.hasNext()) {
			iteratorInteger.next();
			contador++;
		}

		if (contador == arregloDeEnterosPrimario.size()) {
			System.out.println("Todo correcto");
			System.out.println(contador);
		} else {
			System.out.println(contador);
		}

		// Ejercicio 37
		System.out.println("");
		System.out.println("Ejercicio 37");

		arregloDeEnterosPrimario.add(55);
		arregloDeEnterosPrimario.add(81);

		iteratorInteger = arregloDeEnterosPrimario.iterator();

		while (iteratorInteger.hasNext()) {
			int ayudante = iteratorInteger.next();
			if (ayudante > 50) {
				System.out.println(ayudante);
			}
		}

		// Ejercicio 38
		System.out.println("");
		System.out.println("Ejercicio 38");

		System.out.println(arregloDeEnterosPrimario);

		iteratorInteger = arregloDeEnterosPrimario.iterator();

		int index = 0;

		while (iteratorInteger.hasNext()) {
			int valor = iteratorInteger.next();
			arregloDeEnterosPrimario.set(index, valor * 2);
			index++;
		}
		System.out.println(arregloDeEnterosPrimario);

		// Ejercicio 39
		System.out.println("");
		System.out.println("Ejercicio 39");

		arregloDeEnterosPrimario.add(-55);
		arregloDeEnterosPrimario.add(-81);

		System.out.println(arregloDeEnterosPrimario);

		iteratorInteger = arregloDeEnterosPrimario.iterator();

		int ayudante;

		while (iteratorInteger.hasNext()) {
			ayudante = iteratorInteger.next();

			if (ayudante < 0) {
				iteratorInteger.remove();
			}
		}

		System.out.println(arregloDeEnterosPrimario);

		// Ejercicio 40
		System.out.println("");
		System.out.println("Ejercicio 40");

		List<String> listaDePalabras = new ArrayList<>();
		listaDePalabras.add("sol");
		listaDePalabras.add("cielo");
		listaDePalabras.add("a");
		listaDePalabras.add("luz");
		listaDePalabras.add("mar");

		Iterator<String> iterator = listaDePalabras.iterator();

		while (iterator.hasNext()) {
			String palabra = iterator.next();
			if (palabra.length() < 3) {
				iterator.remove(); 
			}
		}

		System.out.println(listaDePalabras);
	}

}
