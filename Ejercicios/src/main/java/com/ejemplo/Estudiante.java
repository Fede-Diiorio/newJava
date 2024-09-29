package com.ejemplo;

public class Estudiante {
	String nombre;
	int nota;
	
	public Estudiante(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = (byte) nota;
	}
	
	public void mostrarDatosCompletos() {
		if (nota < 1 || nota > 10) {
			System.out.println("La nota no puede ser inferior a 1 ni superior a 10.");
		} else {
			System.out.println("El estudiante " + nombre + " tiene una nota de: " + nota);
		}
	}
	
	public void estaAprobado() {
		
		if(nota < 1 || nota > 10) {
			System.out.println("La nota no puede ser inferior a 1 ni superior a 10.");
		} else if(nota >= 6) {
			System.out.println("El alumno " + nombre + " se encuentra aprobado.");
		} else {
			System.out.println("El alumno " + nombre + " no está aprobado.");
		}
	}
	
}
