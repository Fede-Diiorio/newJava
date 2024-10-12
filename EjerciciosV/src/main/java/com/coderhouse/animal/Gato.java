package com.coderhouse.animal;

public class Gato extends Animal {

	@Override
	public void hacerSonido() {
		System.out.println(getNombre() + " está maullando.");
	}

	@Override
	public void alimentarse() {
		System.out.println(getNombre() + " está comiendo alimento Whiskas.");
	}

	@Override
	public void moverse() {
		System.out.println(getNombre() + " está avanzando sigilosamente.");
	}
}
