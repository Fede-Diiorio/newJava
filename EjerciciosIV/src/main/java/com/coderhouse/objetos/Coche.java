package com.coderhouse.objetos;

public class Coche {

	// Atributos
	private String marca;
	private String modelo;
	private int anio;

	// Constantes
	private static final int ANIO_MINIMO = 1886;
	private static final int ANIO_ACTUAL = 2024;

	String mensajeDeError = "Debe ingresar un año válido situado entre " + ANIO_MINIMO + " y " + ANIO_ACTUAL;

	// Métodos
	public void imprimirDatos() {
		System.out.println("Datos del vehículo:");
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Año: " + getAnio());
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return this.anio;
	}

	public void setAnio(int anio) throws Exception {
		if (anio < ANIO_MINIMO || anio > ANIO_ACTUAL) {
			throw new Exception(mensajeDeError);
		} else {
			this.anio = anio;
		}

	}

}
