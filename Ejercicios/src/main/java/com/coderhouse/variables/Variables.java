package com.coderhouse.variables;

public class Variables {

	public static void main(String[] args) {
		
		// Ejercicio 1
		
		byte edad = 28;
		System.out.println("La edad del usuario es: " + edad);
		
		//Ejercicio 2
		
		byte diasDeLaSemana = 7;
		System.out.println("La semana tiene una cantidad de " + diasDeLaSemana + " días.");
		
		//Ejercicio 3
		
		double precioDelProducto = 15000000.99;
		System.out.println("El producto cuenta: $" + precioDelProducto);
		
		//Ejercicio 4 
		
		boolean aprobado = true;
		
		if(aprobado == true) {
			System.out.println("El estudiante se encuentra aprobado.");
		} else {
			System.out.println("El estudiante se encuentra desaprobado.");
		}
		
		//Ejercicio 5
		
		char inicial = 'F';
		System.out.println("El nombre de la persona comienza con: " + inicial);
		
		//Ejercicio 6
		
		byte[] notas = {10, 8, 6, 2, 7};
		for(byte i = 0; i <notas.length; i++) {
			System.out.println("La nota del alumno número " + i + " es: " + notas[i]);
		}
		
		//Ejercicio 7 y 8
		
		String nombreCompleto = "Federico Di Iorio";
		float pesoCorporal = 77.8F;
		System.out.println("Mi nombre es " + nombreCompleto + " y peso " + pesoCorporal + " kilos");

	}

}
