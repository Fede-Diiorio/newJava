package com.coderhouse.objetos;

public class Contador {

	private static int contadorObjetos = 0;

	public Contador() {
		contadorObjetos++; // Cada vez que se crea un objeto, aumenta el contador
	}

	public static int getContadorObjetos() {
		return contadorObjetos;
	}

	public static void imprimirContador() {
		System.out.println("Se han creado " + contadorObjetos + " objetos de la clase Contador.");
	}
}
