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

		if (cadena1.isEmpty()) {
			System.out.println("El arreglo se encuentra vacío");
		} else {
			System.out.println("El arreglo no se encuentra vacío");
		}

		cadena1.add("Carlitos");
		cadena1.add("Juan");
		cadena1.add("Javo");

		if (cadena1.isEmpty()) {
			System.out.println("El arreglo se encuentra vacío");
		} else {
			System.out.println("El arreglo no se encuentra vacío");
		}

		// Ejercicio 5
		System.out.println("");
		System.out.println("Ejercicio 5");

		int numeroADividir = 25;

		if (numeroADividir % 5 == 0) {
			System.out.println("El número " + numeroADividir + " es divisible por 5.");
		} else {
			System.out.println("El número " + numeroADividir + " no se puede dividir por 5.");
		}

		// Ejercicio 6
		System.out.println("");
		System.out.println("Ejercicio 6");

		int numeroParaValidar = 50;

		if (numeroParaValidar % 2 == 0) {
			System.out.println("El número " + numeroParaValidar + " es un número par.");
		} else {
			System.out.println("El número " + numeroParaValidar + " es un número impar.");
		}

		// Ejercicio 7
		System.out.println("");
		System.out.println("Ejercicio 7");

		int edadDePersona = 8;

		if (edadDePersona >= 18) {
			System.out.println("La persona es mayor de edad, puede votar.");
		} else if (edadDePersona < 18 && edadDePersona > 0) {
			System.out.println("La persona es menor de edad, no puede votar.");
		} else {
			System.out.println("Edad inválida o mal cargada.");
		}

		// Ejercicio 8
		System.out.println("");
		System.out.println("Ejercicio 8");

		char letraDePrueba = '@';

		if (letraDePrueba == 'a' || letraDePrueba == 'e' || letraDePrueba == 'i' || letraDePrueba == 'o'
				|| letraDePrueba == 'u') {
			System.out.println("La letra ingresada es una vocal.");
		} else if (letraDePrueba >= 'a' && letraDePrueba <= 'z') {
			System.out.println("La letra ingresada es una consonante.");
		} else {
			System.out.println("Letra inválida.");
		}

		// Ejercicio 9
		System.out.println("");
		System.out.println("Ejercicio 9");

		int ejercicio9 = -1;

		if (ejercicio9 > 0) {
			System.out.println("El número " + ejercicio9 + " es un número positivo.");
		} else if (ejercicio9 < 0) {
			System.out.println("El número " + ejercicio9 + " es un número negativo.");
		} else if (ejercicio9 == 0) {
			System.out.println("El número 0 es neutro.");
		} else {
			System.out.println("El valor ingresado no es válido.");
		}

		// Ejercicio 10
		System.out.println("");
		System.out.println("Ejercicio 10");

		int anio = 2000;

		if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
			System.out.println("El año " + anio + " es un año bisiesto.");
		} else {
			System.out.println("El año " + anio + " no es un año bisiesto.");
		}

		// Ejercicio 11
		System.out.println("");
		System.out.println("Ejercicio 11");

		int categoriaEdad = 24;

		if (categoriaEdad >= 0 && categoriaEdad <= 2) {
			System.out.println("La edad de la persona corresponde con la de un bebé.");
		} else if (categoriaEdad > 2 && categoriaEdad <= 12) {
			System.out.println("La edad de la persona corresponde con la de un niño.");
		} else if (categoriaEdad >= 13 && categoriaEdad <= 18) {
			System.out.println("La edad de la persona corresponde con la de un adolescente.");
		} else if (categoriaEdad >= 19 && categoriaEdad <= 64) {
			System.out.println("La edad de la persona corresponde con la de un adulto.");
		} else if (categoriaEdad >= 65) {
			System.out.println("La edad de la persona corresponde con la de un anciano.");
		} else {
			System.out.println("Edad inválida.");
		}

		// Ejercicio 12
		System.out.println("");
		System.out.println("Ejercicio 12");

		int edadParaElPrecio = 65;

		if (edadParaElPrecio >= 0 && edadParaElPrecio <= 18) {
			System.out.println(
					"El precio de la entrada para una persona de " + edadParaElPrecio + " años es de 5 euros.");
		} else if (edadParaElPrecio >= 19 && edadParaElPrecio <= 64) {
			System.out.println(
					"El precio de la entrada para una persona de " + edadParaElPrecio + " años es de 10 euros.");
		} else if (edadParaElPrecio >= 65) {
			System.out.println(
					"El precio de la entrada para una persona de " + edadParaElPrecio + " años es de 7 euros.");
		} else {
			System.out.println("No se puede determinar el precio de la entrada porque la edad no es un dato válido.");
		}

		// Ejercicio 13
		System.out.println("");
		System.out.println("Ejercicio 13");

		int calificacion = 90;

		if (calificacion <= 100 && calificacion >= 90) {
			System.out.println("El alumno obtuvo una calificación de A (" + calificacion + ").");
		} else if (calificacion <= 89 && calificacion >= 80) {
			System.out.println("El alumno obtuvo una calificación de B (" + calificacion + ").");
		} else if (calificacion <= 79 && calificacion >= 70) {
			System.out.println("El alumno obtuvo una calificación de C (" + calificacion + ").");
		} else if (calificacion <= 69 && calificacion >= 60) {
			System.out.println("El alumno obtuvo una calificación de D (" + calificacion + ").");
		} else if (calificacion < 60 && calificacion >= 0) {
			System.out.println("El alumno obtuvo una calificación de F (" + calificacion + ").");
		} else {
			System.out.println("Puntaje inválido.");
		}

		// Ejercicio 14
		System.out.println("");
		System.out.println("Ejercicio 14");

		int ejercicio14 = -7;

		if (ejercicio14 > 0) {
			System.out.println("El número " + ejercicio14 + " es un número positivo.");
		} else if (ejercicio14 < 0) {
			System.out.println("El número " + ejercicio14 + " es un número negativo.");
		} else if (ejercicio14 == 0) {
			System.out.println("El número 0 es neutro.");
		} else {
			System.out.println("El valor ingresado no es válido.");
		}

		// Ejercicio 15
		System.out.println("");
		System.out.println("Ejercicio 15");

		int peligrosidad = 3;

		if (peligrosidad == 1) {
			System.out.println("El volcán se encuentra dormido.");
		} else if (peligrosidad == 2) {
			System.out.println("El volcán se encuentra activo.");
		} else if (peligrosidad == 3) {
			System.out.println("¡ERUPCIÓN INMINENTE!");
		} else {
			System.out.println("Datos inválidos.");
		}

		// Ejercicio 16
		System.out.println("");
		System.out.println("Ejercicio 16");

		int dia = 5;

		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Datos inválidos.");
			break;
		}

		// Ejercicio 17
		System.out.println("");
		System.out.println("Ejercicio 17");

		int mes = 4;

		switch (mes) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Sptiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
		default:
			System.out.println("Datos inválidos");
			break;
		}

		// Ejercicio 18
		System.out.println("");
		System.out.println("Ejercicio 18");

		int estacion = 1;

		switch (estacion) {
		case 1:
			System.out.println("Invierno");
			break;
		case 2:
			System.out.println("Primavera");
			break;
		case 3:
			System.out.println("Varano");
			break;
		case 4:
			System.out.println("Otoño");
			break;
		default:
			System.out.println("Datos inválidos");
			break;
		}

		// Ejercicio 19
		System.out.println("");
		System.out.println("Ejercicio 19");

		char operacion = '/';
		float operador1 = 10f;
		float operador2 = 6f;

		switch (operacion) {
		case '+':
			System.out.println("El resultado de la suma es: " + (operador1 + operador2));
			break;
		case '-':
			System.out.println("El resultado de la resta es: " + (operador1 - operador2));
			break;
		case '*':
			System.out.println("El resultado de la multiplicación es: " + (operador1 * operador2));
			break;
		case '/':
			if (operador2 != 0) {
				System.out.println("El resultado de la división es: " + (operador1 / operador2));
			} else {
				System.out.println("El divisor debe ser diferente de 0");
			}
			break;
		default:
			System.out.println("Operación no reconocida.");
			break;
		}

		// Ejercicio 20
		System.out.println("");
		System.out.println("Ejercicio 20");

		int fruta = 4;

		switch (fruta) {
		case 1:
			System.out.println("Manzana");
			break;
		case 2:
			System.out.println("Plátano");
			break;
		case 3:
			System.out.println("Naranja");
			break;
		case 4:
			System.out.println("Uva");
			break;
		default:
			System.out.println("Datos inválidos");
			break;
		}

		// Ejercicio 21
		System.out.println("");
		System.out.println("Ejercicio 21");

		int ej21 = 24;

		String respuesta21 = ej21 % 2 == 0 ? "El número " + ej21 + " es par." : "El número " + ej21 + " es impar.";
		System.out.println(respuesta21);

		// Ejercicio 22
		System.out.println("");
		System.out.println("Ejercicio 22");

		int ej22 = 24;
		if (ej22 >= 0) {
			String respuesta22 = ej22 >= 18 ? "La persona es mayor de edad" : "La persona es menor de edad";
			System.out.println(respuesta22);
		} else {
			System.out.println("Datos inválidos.");
		}

		// Ejercicio 23
		System.out.println("");
		System.out.println("Ejercicio 23");

		int ej23 = 24;

		if (ej23 != 0) {
			String respuesta23 = ej23 > 0 ? "Positivo" : "Negativo";
			System.out.println(respuesta23);
		} else {
			System.out.println("Neutro");
		}

		// Ejercicio 24
		System.out.println("");
		System.out.println("Ejercicio 24");

		int ej24a = 29;
		int ej24b = 24;
		int respuesta24 = ej24a > ej24b ? ej24a : ej24b;
		System.out.println("El número " + respuesta24 + " el el más grende entre " + ej24a + " y " + ej24b + ".");

		// Ejercicio 25
		System.out.println("");
		System.out.println("Ejercicio 25");

		int nota25 = 10;
		if (nota25 >= 1 && nota25 <= 10) {
			String respuesta25 = nota25 >= 6 ? "APROBADO" : "REPROBADO";
			System.out.println("El alumno se encuentra " + respuesta25 + " con: " + nota25);
		} else {
			System.out.println("Datos inválidos.");
		}

		// Ejercicio 26
		System.out.println("");
		System.out.println("Ejercicio 26");

		int randomNumber = (int) (Math.random() * 10) + 1;

		if (randomNumber > 5) {
			System.out.println("El número " + randomNumber + " es mayor que 5.");
		} else {
			System.out.println("El número " + randomNumber + " es menor que 5.");
		}

		// Ejercicio 27
		System.out.println("");
		System.out.println("Ejercicio 27");

		byte dadoNumber = (byte) ((byte) (Math.random() * 6) + 1);
		System.out.println(dadoNumber);

		// Ejercicio 28
		System.out.println("");
		System.out.println("Ejercicio 28");

		int randomNumber28 = (int) (Math.random() * 100) + 1;

		if (randomNumber28 > 50) {
			System.out.println("El número " + randomNumber28 + " es mayor que 50.");
		} else {
			System.out.println("El número " + randomNumber28 + " es menor que 50.");
		}

		// Ejercicio 29
		System.out.println("");
		System.out.println("Ejercicio 29");

		byte moneda = (byte) ((byte) (Math.random() * 2) + 1);

		if (moneda == 1) {
			System.out.println("Cara");
		} else if (moneda == 2) {
			System.out.println("Seca");
		} else {
			System.out.println("Error");
		}

		// Ejercicio 30
		System.out.println("");
		System.out.println("Ejercicio 30");

		if (randomNumber28 % 10 == 0) {
			System.out.println("El número " + randomNumber28 + " es multiplo de 10.");
		} else {
			System.out.println("El número " + randomNumber28 + " NO es multiplo de 10.");
		}

		// Ejercicio 31
		System.out.println("");
		System.out.println("Ejercicio 31");

		int ej31 = 0;

		String respuesta31 = ej31 > 0 ? "positivo" : ej31 < 0 ? "negativo" : "neutro";

		System.out.println("El número " + ej31 + " es un número " + respuesta31);

		// Ejercicio 32
		System.out.println("");
		System.out.println("Ejercicio 32");

		int semaforo = (int) (Math.random() * 3) + 1;

		switch (semaforo) {
		case 1:
			System.out.println("Semaforo en: verde");
			break;
		case 2:
			System.out.println("Semaforo en: amarillo");
			break;
		case 3:
			System.out.println("Semaforo en: rojo");
			break;
		}

		// Ejercicio 33
		System.out.println("");
		System.out.println("Ejercicio 33");

		int randomEntre1y10 = (int) (Math.random() * 10) + 1;
		int loteria = 3;

		if (loteria >= 1 && loteria <= 10) {
			if (randomEntre1y10 == loteria) {
				System.out.println("¡FELICIDADES!");
				System.out.println("Número ganador: " + randomEntre1y10);
				System.out.println("Número elegido: " + loteria);
			} else {
				System.out.println("Suerte para la próxima :(");
				System.out.println("Número ganador: " + randomEntre1y10);
				System.out.println("Número elegido: " + loteria);
			}
		} else {
			System.out.println("Datos inválidos");
		}

		// Ejercicio 34
		System.out.println("");
		System.out.println("Ejercicio 34");

		int randomEntre1Y100 = (int) (Math.random() * 100) + 1;

		if (randomEntre1Y100 % 3 == 0) {
			System.out.println("El número " + randomEntre1Y100 + " es divisible por 3.");
		} else if (randomEntre1Y100 % 5 == 0) {
			System.out.println("El número " + randomEntre1Y100 + " es divisible por 5.");
		} else {
			System.out.println("El número " + randomEntre1Y100 + " no se puede dividir por 3 ni por 5.");
		}

		// Ejercicio 35
		System.out.println("");
		System.out.println("Ejercicio 35");

		if (dadoNumber >= 4) {
			System.out.println("El dado ha caido en el número " + dadoNumber + ". Has ganado el encuentro");
		} else {
			System.out.println("El dado ha caido en el número " + dadoNumber + ". Has perdido el encuentro");
		}

		// Ejercicio 36
		System.out.println("");
		System.out.println("Ejercicio 36");

		if (randomEntre1Y100 < 30) {
			System.out.println("El número " + randomEntre1Y100 + " es de categoría baja.");
		} else if (randomEntre1Y100 >= 30 && randomEntre1Y100 <= 70) {
			System.out.println("El número " + randomEntre1Y100 + " es de categoría media.");
		} else if (randomEntre1Y100 > 70) {
			System.out.println("El número " + randomEntre1Y100 + " es de categoría alta.");
		} else {
			System.out.println("datos inválidos.");
		}

		// Ejercicio 37
		System.out.println("");
		System.out.println("Ejercicio 37");

		int contador37 = 0;

		for (int i = 1; i <= randomEntre1Y100; i++) {
			if (randomEntre1Y100 % i == 0) {
				contador37++;
			}
		}

		if (contador37 == 2) {
			System.out.println("El número " + randomEntre1Y100 + " es un número primo");
		} else {
			System.out.println("El número " + randomEntre1Y100 + " NO es un número primo");
		}

		// Ejercicio 38
		System.out.println("");
		System.out.println("Ejercicio 38");

		int adivinar = 6;

		if (adivinar >= 1 && adivinar <= 10) {
			if (adivinar == randomEntre1y10) {
				System.out.println("¡Adivinaste!");
			} else {
				System.out.println("Más suerte para la próxima.");
			}
		} else {
			System.out.println("Datos inválidos.");
		}

		// Ejercicio 39
		System.out.println("");
		System.out.println("Ejercicio 39");

		int randomEntre1y50 = (int) (Math.random() * 50) + 1;
		
		if(randomEntre1y50 >= 20 && randomEntre1y50 <= 30) {
			System.out.println(randomEntre1y50 + " - Dentro del rango.");
		} else {
			System.out.println(randomEntre1y50 + " - Fuera del rango.");
		}
	}

}
