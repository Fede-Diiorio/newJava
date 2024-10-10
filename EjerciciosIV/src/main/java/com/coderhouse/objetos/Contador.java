package com.coderhouse.objetos;

public class Contador {

	// Variable estática
	private static int contadorObjetos = 0;

	// Constructor de la clase
	public Contador() {
		contadorObjetos++;
	}

	public static int getContadorObjetos() {
		return contadorObjetos;
	}

	public static void imprimirContador() {
		System.out.println("Se han creado " + contadorObjetos + " objetos de la clase Contador.");
	}
}
