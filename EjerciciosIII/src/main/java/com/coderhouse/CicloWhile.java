package com.coderhouse;

import java.awt.Container;
import java.util.ArrayList;
import java.util.List;

public class CicloWhile {

	public static void main(String[] args) {

		// Ejercicio 61
		System.out.println("");
		System.out.println("Ejercicio 61");

		int contador = 0;

		while (contador != 10) {
			contador += 1;
			System.out.println(contador);
		}

		// Ejercicio 62
		System.out.println("");
		System.out.println("Ejercicio 62");

		int sumador = 0;
		contador = 1;

		while (contador <= 100) {
			sumador += contador;
			contador++;
		}

		System.out.println(sumador);

		// Ejercicio 63
		System.out.println("");
		System.out.println("Ejercicio 63");

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
		int buscador = 0;

		while (contador < arregloDeEnterosPrimario.size()) {
			if (arregloDeEnterosPrimario.get(contador) > buscador) {
				buscador = arregloDeEnterosPrimario.get(contador);
			}
			contador++;
		}

		System.out.println("El número más grande es: " + buscador);

		// Ejercicio 64
		System.out.println("");
		System.out.println("Ejercicio 64");

		contador = 0;
		buscador = 0;

		while (contador < arregloDeEnterosPrimario.size()) {
			if (arregloDeEnterosPrimario.get(contador) % 2 != 0) {
				buscador++;
			}
			contador++;
		}

		System.out.println("El arreglo tiene " + buscador + " números impares.");

		// Ejercicio 65
		System.out.println("");
		System.out.println("Ejercicio 65");

		contador = 1;

		while (contador <= 20) {
			if (contador % 2 == 0) {
				System.out.println(contador);
			}
			contador++;
		}

		// Ejercicio 66
		System.out.println("");
		System.out.println("Ejercicio 66");

		contador = 0;
		buscador = 0;

		while (contador < arregloDeEnterosPrimario.size()) {
			System.out.println(arregloDeEnterosPrimario.get(contador));
			contador++;
		}

		// Ejercicio 67
		System.out.println("");
		System.out.println("Ejercicio 67");

		contador = 0;

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

		while (contador < arregloDeCadenaPrimario.size()) {

			contador++;
		}

		System.out.println("El arreglo tiene " + contador + " elementos.");

		// Ejercicio 68
		System.out.println("");
		System.out.println("Ejercicio 68");

		contador = 7;

		while (contador <= 70) {
			System.out.println(contador);
			contador += 7;
		}

		// Ejercicio 69
		System.out.println("");
		System.out.println("Ejercicio 69");

		int numeroFactorial = 14;
		long factorial = 1L;
		contador = 1;

		while (contador <= numeroFactorial) {
			factorial *= contador;
			contador++;

		}
		System.out.println("El factorial de " + numeroFactorial + " es: " + factorial);

		// Ejercicio 70
		System.out.println("");
		System.out.println("Ejercicio 70");
		
		int[] numeros = {34, 15, 88, 2, 23, 75}; // Array de enteros
        int menorValor = numeros[0]; // Inicializa el menor valor como el primer elemento
        contador = 1; // Comienza desde el segundo elemento

        while (contador < numeros.length) {
            if (numeros[contador] < menorValor) {
                menorValor = numeros[contador]; // Actualiza el menor valor
            }
            contador++; // Incrementa el contador
        }

        System.out.println("El menor valor en el array es: " + menorValor);
	}
}
