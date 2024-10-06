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

	}

}
