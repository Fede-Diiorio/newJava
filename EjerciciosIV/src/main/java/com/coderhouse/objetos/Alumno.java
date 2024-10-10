package com.coderhouse.objetos;

import java.util.List;
import java.util.ArrayList;

public class Alumno {

	// Atributos
	private String nombre;
	private int matricula;
	private int promedio;
	private List<Integer> promedioDeNotas = new ArrayList<Integer>();

	// Get y Set
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPromedio() {
		return this.promedio;
	}

	public int getMatricula() {
		return this.matricula;
	}

	public List<Integer> getPromedioDeNotas() {
		return this.promedioDeNotas;
	}

	public void setPromedioDeNotas(int nota1, int nota2, int nota3) throws Exception {
		String erroDeNotas = "Todas las notas deben ser mayores a 1 y menores a 10.";
		if ((nota1 < 1 || nota1 > 10) || (nota2 < 1 || nota2 > 10) || (nota3 < 1 || nota3 > 10)) {
			throw new Exception(erroDeNotas);
		} else {
			promedioDeNotas.add(nota1);
			promedioDeNotas.add(nota2);
			promedioDeNotas.add(nota3);
		}

	}

	public void setMatricula(int matricula) throws Exception {
		String errorDeMatricula = "La matrícula debe tener, al menos, 4 dígitos.";
		if (String.valueOf(matricula).length() < 4) { // Cambiado de <= a <
			throw new Exception(errorDeMatricula);
		} else {
			this.matricula = matricula;
		}
	}

	public void setPromedio(int promedio) throws Exception {
		String errorDePromedio = "El promedio debe estar entre 1 y 10 inclusive.";
		if (promedio < 1 || promedio > 10) { // Cambiado de <= 0 y >= 11 a < 1 y > 10
			throw new Exception(errorDePromedio);
		} else {
			this.promedio = promedio;
		}
	}

	// Métodos
	public void imprimirDatos() {
		System.out.println("El alumno " + getNombre() + ", matrícula número " + getMatricula()
				+ " tiene un promedio de: " + getPromedio() + ".");
	}
	
	public void calcularPromedioDeNotas() {
		int i = 1;
		float sumarTodasLasNotas = 0f;
		
		for(int numero : promedioDeNotas) {
			System.out.println("Nota Nº " + i + ": " + numero);
			i++;
			sumarTodasLasNotas += numero;
		}
		
		System.out.println("El promedio del estudiante es: " +(sumarTodasLasNotas / promedioDeNotas.size()));
	}
}
