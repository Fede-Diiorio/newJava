package com.coderhose.condicionales;

public class Avanzados {

	public static void main(String[] args) {
		// Ejercicio 40
		System.out.println("");
		System.out.println("Ejercicio 40");

		int dado1 = (int) (Math.random() * 6) + 1;
		int dado2 = (int) (Math.random() * 6) + 1;
		int dado3 = (int) (Math.random() * 6) + 1;
		int ataque = dado1 + dado2 + dado3;

		System.out.println("Dado 1: " + dado1);
		System.out.println("Dado 2: " + dado2);
		System.out.println("Dado 3: " + dado3);

		if (ataque >= 10) {
			System.out.println("Golpe acertado. Daño: " + ataque);
		} else {
			System.out.println("Fallaste el ataque. Recibiste daño: " + ataque);
		}

		// Ejercicio 41
		System.out.println("");
		System.out.println("Ejercicio 41");

		int randomEntre1y5 = (int) (Math.random() * 5) + 1;

		switch (randomEntre1y5) {
		case 1:
			System.out.println("Rojo");
			break;
		case 2:
			System.out.println("Azul");
			break;
		case 3:
			System.out.println("Verde");
			break;
		case 4:
			System.out.println("Amarillo");
			break;
		case 5:
			System.out.println("Rosa");
			break;
		default:
			System.out.println("Datos inválidos");
			break;
		}

		// Ejercicio 42
		System.out.println("");
		System.out.println("Ejercicio 42");

		float precioDelProducto = 100f;
		String cliente = "VIP";

		switch (cliente) {
		case "Normal":
			System.out.println("Precio final: " + precioDelProducto);
			break;
		case "Miembro":
			System.out.println("Precio final: " + (precioDelProducto * 0.90));
			break;
		case "VIP":
			System.out.println("Precio final: " + (precioDelProducto * 0.80));
			break;
		default:
			System.out.println("Datos inválidos.");
			break;

		}

		// Ejercicio 43
		System.out.println("");
		System.out.println("Ejercicio 43");

		int clima = (int) (Math.random() * 4) + 1;

		switch (clima) {
		case 1:
			System.out.println("Soleado");
			break;
		case 2:
			System.out.println("Soleado");
			break;
		case 3:
			System.out.println("Soleado");
			break;
		case 4:
			System.out.println("Soleado");
			break;
		default:
			System.out.println("Datos inválidos");
			break;
		}

		// Ejercicio 44
		System.out.println("");
		System.out.println("Ejercicio 44");

		int jugador1 = (int) (Math.random() * 3) + 1;
		int jugador2 = (int) (Math.random() * 3) + 1;

		switch (jugador1) {
		case 1:
			System.out.println("Juagador 1: Piedra");
			switch (jugador2) {
			case 1:
				System.out.println("Juagador 2: Piedra");
				System.out.println("Empate");
				break;
			case 2:
				System.out.println("Juagador 2: Papel");
				System.out.println("Gana el jugador 2");
				break;
			case 3:
				System.out.println("Jugador 2: Tijeras");
				System.out.println("Gana el jugador 1");
				break;
			default:
				System.out.println("Error del jugador 2");
				break;
			}
			break;

		case 2:
			System.out.println("Juagador 1: Papel");
			switch (jugador2) {
			case 1:
				System.out.println("Juagador 2: Piedra");
				System.out.println("Gana el jugador 1");
				break;
			case 2:
				System.out.println("Juagador 2: Papel");
				System.out.println("Empate");
				break;
			case 3:
				System.out.println("Jugador 2: Tijeras");
				System.out.println("Gana el jugador 2");
				break;
			default:
				System.out.println("Error del jugador 2");
				break;
			}
			break;
		case 3:
			System.out.println("Juagador 1: Tijeras");
			switch (jugador2) {
			case 1:
				System.out.println("Juagador 2: Piedra");
				System.out.println("Gana el jugador 2");
				break;
			case 2:
				System.out.println("Juagador 2: Papel");
				System.out.println("Gana el jugador 1");
				break;
			case 3:
				System.out.println("Jugador 2: Tijeras");
				System.out.println("Empate");
				break;
			default:
				System.out.println("Error del jugador 2");
				break;
			}
			break;
		default:
			System.out.println("Error del jugador 1");
			break;
		}

		// Ejercicio 45
		System.out.println("");
		System.out.println("Ejercicio 45");

		int adivinanza = 3;

		if (adivinanza >= 1 && adivinanza <= 5) {
			if (adivinanza == randomEntre1y5) {
				System.out.println("ADIVINASTE");
			} else {
				System.out.println("Más suerte la proxima");
			}

		} else {
			System.out.println("Datos inválidos.");
		}

		// Ejercicio 46
		System.out.println("");
		System.out.println("Ejercicio 46");

		int nota = 90;
		int edad = 24;

		if ((nota >= 0 && nota <= 100) && edad >= 5) {
			if (edad < 25) {
				if (nota >= 85) {
					System.out.println("Beca asignada");
				} else {
					System.out.println("Su promedio no es suficiente para acceder a nuestro programa.");
				}
			} else {
				System.out.println("Debe tener menos de 25 años para poder acceder a una beca");
			}
		} else {
			System.out.println("Datos inválidos");
		}

		// Ejercicio 47
		System.out.println("");
		System.out.println("Ejercicio 47");

		int numero = (int) (Math.random() * 100) + 1;
		System.out.println("Número generado: " + numero);

		int sumaDivisores = 0;

		for (int i = 1; i <= numero / 2; i++) {
			if (numero % i == 0) {
				sumaDivisores += i;
			}
		}

		if (sumaDivisores == numero) {
			System.out.println(numero + " es un número perfecto.");
		} else {
			System.out.println(numero + " no es un número perfecto.");
		}

		// Ejercicio 48
		System.out.println("");
		System.out.println("Ejercicio 48");

		int aleatorioEntre1y100 = (int) (Math.random() * 100) + 1;
		int randomEntre1y100 = (int) (Math.random() * 100) + 1;

		if (aleatorioEntre1y100 > randomEntre1y100) {
			System.out.println("El número " + aleatorioEntre1y100 + " es mayor que " + randomEntre1y100);
		} else {
			System.out.println("El número " + randomEntre1y100 + " es mayor que " + aleatorioEntre1y100);
		}

		// Ejercicio 49
		System.out.println("");
		System.out.println("Ejercicio 49");

		String comparatoria = aleatorioEntre1y100 > 75 ? "Mayor que 75 " + (aleatorioEntre1y100)
				: "Menor que 75 " + (aleatorioEntre1y100);
		System.out.println(comparatoria);

		// Ejercicio 50
		System.out.println("");
		System.out.println("Ejercicio 50");

		int dado4 = (int) (Math.random() * 6) + 1;
		int dado5 = (int) (Math.random() * 6) + 1;
		int sumatoria = dado4 + dado5;

		System.out.println("Dado 1: " + dado4);
		System.out.println("Dado 2: " + dado5);

		if (sumatoria == 7 || sumatoria == 1) {
			System.out.println("Ganaste el juego: " + sumatoria);
		} else {
			System.out.println("Perdiste el juego: " + sumatoria);
		}

	}

}
