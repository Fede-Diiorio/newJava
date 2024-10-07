package com.coderhouse;

import java.util.ArrayList;
import java.util.List;

public class CiclosDoWhile {

	public static void main(String[] args) {
		// Ejercicio 71
		System.out.println("");
		System.out.println("Ejercicio 71");

		int contador = 0;

		do {
			contador++;
			System.out.println(contador);

		} while (contador < 10);

		// Ejercicio 72
		System.out.println("");
		System.out.println("Ejercicio 72");

		contador = 0;

		do {
			if (contador % 2 != 0) {
				System.out.println(contador);
			}
			contador++;

		} while (contador < 20);

		// Ejercicio 73
		System.out.println("");
		System.out.println("Ejercicio 73");

		contador = 0;
		int buscador = 0;

		do {
			buscador += contador;
			contador++;
		} while (contador <= 50);

		System.out.println("La suma de los números del 1 al 50 es: " + buscador);

		// Ejercicio 74
		System.out.println("");
		System.out.println("Ejercicio 74");

		int arregloSimple[] = { -1, 2, -3, 6, 5, -4, 7, 8, -9, 12, -48, 50, -321, 46, -85 };
		contador = 0;
		buscador = 0;

		do {
			if (arregloSimple[contador] < 0) {
				buscador++;
			}
			contador++;

		} while (contador < arregloSimple.length);

		System.out.println("El arreglo tiene " + buscador + " números negativos.");

		// Ejercicio 75
		System.out.println("");
		System.out.println("Ejercicio 75");

		String nombreSimple = "Franco Colapinto";
		contador = 0;

		do {
			char letra = nombreSimple.toLowerCase().charAt(contador);
			if (letra >= 'a' && letra <= 'z') {
				System.out.println(letra);
			}
			contador++;
		} while (contador < nombreSimple.length());

		// Ejercicio 76
		System.out.println("");
		System.out.println("Ejercicio 76");

		contador = 0;

		do {
			contador += 3;
			System.out.println(contador);
		} while (contador < 30);

		// Ejercicio 77
		System.out.println("");
		System.out.println("Ejercicio 77");

		contador = 0;

		do {
			if (arregloSimple[contador] % 2 == 0) {
				System.out.println(arregloSimple[contador]);
			}

			contador++;
		} while (contador < arregloSimple.length);

		// Ejercicio 78
		System.out.println("");
		System.out.println("Ejercicio 78");

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

		contador = 0;

		do {
			contador++;
		} while (contador < arregloDeEnterosPrimario.size());

		System.out.println("El arreglo tiene: " + contador + " elementos.");

		// Ejercicio 79
		System.out.println("");
		System.out.println("Ejercicio 79");

		contador = 101;

		do {
			contador--;
			System.out.println(contador);
		} while (contador > 1);

		// Ejercicio 80
		System.out.println("");
		System.out.println("Ejercicio 80");

		int numero = 274;
		int suma = 0;

		do {
			suma += numero % 10;
			numero /= 10;
		} while (numero > 0);

		System.out.println("La suma de los dígitos es: " + suma);

	}

}
