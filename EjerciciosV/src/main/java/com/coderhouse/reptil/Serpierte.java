package com.coderhouse.reptil;

public class Serpierte extends Reptil {

	// Atributos
	private String nombre;

	// GET y SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override

	public void reptar() {
		System.out.println(getNombre() + " está reptando amenazantemente.");
	}
}
