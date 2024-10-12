package com.coderhouse.instrumento;

public class Piano extends Instrumento {

	// Atributos
	private String tipoDePiano;

	public String getTipoDePiano() {
		return tipoDePiano;
	}

	public void setTipoDePiano(String tipoDePiano) {
		this.tipoDePiano = tipoDePiano;
	}

	@Override
	public void afinar() {
		System.out.println("El experto en pianos ha afinado el piano.");
	}

	public void tocar() {
		System.out.println("El piano " + getTipoDePiano() + " está tocando una canzión de Beethoven.");
	}
}
