package com.coderhouse.persona;

import java.util.Objects;

public class Estudiante extends Persona {

	public Estudiante(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	// Atributos
	private int matricula;

	// GET y SET
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) throws Exception {
		int digitos = String.valueOf(matricula).length();
		String mensajeDeError = "Tiene que igresar un número con un mínimo de 4 dígitos.";
		if (digitos < 4 || matricula < 0) {
			throw new Exception(mensajeDeError);
		} else {
			this.matricula = matricula;
		}
	}

	@Override
	public void trabajar() {
		System.out.println(getNombre() + " está trabajando en su proyecto fianl.");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Estudiante estudiante = (Estudiante) obj;
		return matricula == estudiante.matricula;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}
}
