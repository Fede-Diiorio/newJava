package com.coderhouse.estudiante;

public class EstudianteSecundaria extends Estudiante {

	@Override
	public void estudiar() {
		System.out.println("Está aprendiendo integradas y derivadas");
		super.estudiar();
	}
}
