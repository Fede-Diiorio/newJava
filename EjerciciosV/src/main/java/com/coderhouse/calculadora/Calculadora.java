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
		try {
			if (numero2 == 0) {
				throw new ArithmeticException("No se puede dividir por cero.");
			}
			float resultado = (float) numero1 / numero2;
			return resultado;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

	public double calcularRaizCuadrada(int numero1) {
		if (numero1 < 0) {
			throw new IllegalArgumentException("No puede ingresar un número menor a 0.");
		} else {
			return Math.sqrt(numero1);
		}
	}

}
