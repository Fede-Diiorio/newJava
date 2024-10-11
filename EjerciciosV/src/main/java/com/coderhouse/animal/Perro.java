package com.coderhouse.animal;

public class Perro extends Animal {

	@Override
	public void hacerSonido() {
		System.out.println(getNombre() + " está ladrando.");
	}

	public void alimentarse() {
		System.out.println(getNombre() + " está comiendo alimento Sieger.");
	}
}
