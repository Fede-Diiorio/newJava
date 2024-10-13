package com.coderhouse.instrumento;

public class Instrumento {

	// Atributos
	private String tipo;
	private String marca;

	// Constructor
	public Instrumento(String tipo, String marca) {
		this.tipo = tipo;
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// Métodos
	public void tocar() {
		System.out.println("La música está sonando!");
	}

	public void afinar() {
		System.out.println("Ahora el instrumento está afinado");
	}

}
