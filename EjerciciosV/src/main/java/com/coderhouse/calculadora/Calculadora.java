package com.coderhouse.calculadora;

public class Calculadora {

	public int sumar(int numero1, int numero2) {
		return numero1 + numero2;
	}

	public int restar(int numero1, int numero2) {
		return numero1 - numero2;
	}

	public int multiplicar(int numero1, int numero2) {
		return numero1 * numero2;
	}

	public float dividir(int numero1, int numero2) {

		if (numero2 == 0) {
			throw new ArithmeticException("No se puede dividir por cero.");
		}
		float resultado = (float) numero1 / numero2;
		return resultado;

	}

	public double calcularRaizCuadrada(int numero1) {
		if (numero1 < 0) {
			throw new IllegalArgumentException("No puede ingresar un número menor a 0.");
		} else {
			return Math.sqrt(numero1);
		}
	}

	public double calcularFactorial(int factorial) {

		if (factorial < 0) {
			throw new IllegalArgumentException("El factorial debe ser un número positivo.");
		} else {
			int contador = 1;
			
			double factorialFinal = 1;
			for (int i = 1; i <= factorial; i++) {
				factorialFinal *= contador;
				contador++;
			}

			return factorialFinal;
		}
	}
}
