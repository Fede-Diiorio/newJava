package com.coderhouse.conversor;

public class Conversor {

	public int convertirAEntero(String entero) {
	    try {
	        int enteroDelString = Integer.parseInt(entero);
	        return enteroDelString;
	    } catch (NumberFormatException e) {
	        System.out.println("Error: No se pudo convertir el valor a entero.");
	        throw e; 
	    }
	}

}
