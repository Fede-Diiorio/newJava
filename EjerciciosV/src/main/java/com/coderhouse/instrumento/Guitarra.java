package com.coderhouse.instrumento;

public class Guitarra extends Instrumento {

	public Guitarra(String tipo, String marca) {
		super(tipo, marca);
		// TODO Auto-generated constructor stub
	}

	// Métodos
	@Override
	public void tocar() {
		System.out.println("La guitarra " + getTipo() + " está tocando una sucesión de acordes.");
	}
}