package com.coderhouse.integracion.ejercicio37;

public class Calculadora {
	private int numero1;
	private int numero2;

	public Calculadora(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public void sumarNumeros() {
		System.out.println("El resultado de la suma es: " + (numero1 + numero2));
	}

	public void restarNumeros() {
		System.out.println("El resultado de la resta es: " + (numero1 - numero2));
	}

	public void multiplicarNumeros() {
		System.out.println("El resultado de la multiplicación es: " + (numero1 * numero2));
	}

	public void dividirNumeros() {
		if (numero2 == 0) {
			System.out.println("No se pudo completar la división dado que el divisor no puede ser igual a 0.");
		} else {
			System.out.println("El resultado de la división es: " + (numero1 / numero2));
		}
	}

}
