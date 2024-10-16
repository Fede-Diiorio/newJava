package com.coderhouse.calculadora;

public class CalculadoraAvanzada {

	public static int sumar(int numero1, int numero2) {
		return numero1 + numero2;
	}

	public static float sumar(float numero1, float numero2) {
		return numero1 + numero2;
	}

	public static double sumar(double numero1, double numero2) {
		return numero1 + numero2;
	}

	public static int restar(int numero1, int numero2) {
		return numero1 - numero2;
	}

	public static float restar(float numero1, float numero2) {
		return numero1 - numero2;
	}

	public static double restar(double numero1, double numero2) {
		return numero1 - numero2;
	}

	public static int multiplicar(int numero1, int numero2) {
		return numero1 * numero2;
	}

	public static float multiplicar(float numero1, float numero2) {
		return numero1 * numero2;
	}

	public static double multiplicar(double numero1, double numero2) {
		return numero1 * numero2;
	}

	private static void validarDivisor(int divisor) {
		if (divisor == 0) {
			throw new ArithmeticException("No se puede dividir por cero.");
		}
	}

	private static void validarDivisor(float divisor) {
		if (divisor == 0) {
			throw new ArithmeticException("No se puede dividir por cero.");
		}
	}

	private static void validarDivisor(double divisor) {
		if (divisor == 0) {
			throw new ArithmeticException("No se puede dividir por cero.");
		}
	}

	public static int dividir(int numero1, int numero2) {
		validarDivisor(numero2);
		return numero1 / numero2;
	}

	public static float dividir(float numero1, float numero2) {
		validarDivisor(numero2);
		return numero1 / numero2;
	}

	public static double dividir(double numero1, double numero2) {
		validarDivisor(numero2);
		return numero1 / numero2;
	}

}
