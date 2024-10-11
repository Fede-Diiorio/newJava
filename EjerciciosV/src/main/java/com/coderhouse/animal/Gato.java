package com.coderhouse.animal;

public class Gato extends Animal {

	@Override
	public void hacerSonido() {
		System.out.println(getNombre() + " está maullando.");
	}

	public void alimentarse() {
		System.out.println(getNombre() + " está comiendo alimento Whiskas.");
	}

	public void moverse() {
		System.out.println(getNombre() + " está avanzando sigilosamente.");
	}
}
