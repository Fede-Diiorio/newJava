package com.coderhouse.instrumento;

public class Piano extends Instrumento {

	public Piano(String tipo, String marca) {
		super(tipo, marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afinar() {
		System.out.println("El experto en pianos ha afinado el piano.");
	}

	public void tocar() {
		System.out.println(getTipo() + " está tocando una canzión de Beethoven.");
	}
}
