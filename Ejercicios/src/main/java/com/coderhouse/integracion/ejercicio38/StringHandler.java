package com.coderhouse.integracion.ejercicio38;

public class StringHandler {
	private String texto;
	
	public StringHandler(String texto) {
		this.texto = texto;
	}
	
	// Método para imprimir cada letra del String
	public void deletrear() {
		for (int i = 0; i < texto.length(); i++) {
		    char letra = texto.charAt(i);
		    System.out.println(letra);
		}
	}
	
	// Método para contar vocales y consonantes
	public void contarLetras() {
		int contadorVocales = 0;
		int contadorConsonantes = 0;
		
		// Convertir el texto a minúsculas para evitar problemas con mayúsculas
		String textoMinusculas = texto.toLowerCase();
		
		for (int i = 0; i < textoMinusculas.length(); i++) {
			char letra = textoMinusculas.charAt(i);
			
			// Verificar si es una vocal
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				contadorVocales++;
			} 
			// Verificar si es una letra (excluyendo vocales)
			else if (letra >= 'a' && letra <= 'z') {
				contadorConsonantes++;
			}
		}
		
		System.out.println("El string: --" + texto + "-- cuenta con " + contadorVocales + " vocales y " + contadorConsonantes + " consonantes.");
	}
}
