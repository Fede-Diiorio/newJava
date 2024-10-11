package com.coderhouse.instrumento;

public class Guitarra extends Instrumento {

	// Atributos
	private String tipoDeGuitarra;

	// GET y SET
	public String getTipoDeGuitarra() {
		return tipoDeGuitarra;
	}

	public void setTipoDeGuitarra(String tipoDeGuitarra) {
		this.tipoDeGuitarra = tipoDeGuitarra;
	}
	// Métodos

	@Override
	public void tocar() {
		System.out.println("La guitarra " + getTipoDeGuitarra() + " está tocando arpegios.");
	}
}