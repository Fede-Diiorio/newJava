package com.coderhouse.integracion.ejercicio35;

public class VerificarPrimo {

	int numero;

	public VerificarPrimo(int numero) {
		this.numero = numero;
	}

	public void esPrimo() {
		int contador = 0;

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}

		if (contador == 2) {
			System.out.println("El número " + numero + " es un número primo.");
		} else {
			System.out.println("El número " + numero + " NO es un número primo.");
		}
	}

}
