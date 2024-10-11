package com.coderhouse.persona;

public class Estudiante extends Persona {

	@Override
	public void trabajar() {
		System.out.println(getNombre() + " está trabajando en su proyecto fianl.");
	}
}
