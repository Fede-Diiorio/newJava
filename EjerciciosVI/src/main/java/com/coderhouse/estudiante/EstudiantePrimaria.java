package com.coderhouse.estudiante;

public class EstudiantePrimaria extends Estudiante {

	@Override
	public void estudiar() {
		System.out.println("Está aprendidendo a sumar y restar");
		super.estudiar();
	}
}
