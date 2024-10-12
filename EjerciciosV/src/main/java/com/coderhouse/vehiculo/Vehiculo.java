package com.coderhouse.vehiculo;

import java.util.Objects;

public class Vehiculo {

	// Atributos
	private String marca;
	private String modelo;
	private int anio;
	private String matricula;

	// constantes
	private static final int ANIO_ACTUAL = 2024;

	// Get y set

	public String getMarca() {
		return marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) throws Exception {
		String errorEnElAnio = "No puede ingresar un año superior al año actual.";
		if (anio > ANIO_ACTUAL) {
			throw new Exception(errorEnElAnio);
		} else {
			this.anio = anio;
		}
	}

	// Métodos

	public void arrancar() {
		System.out.println("El vehículo está arrancando.");
	}

	public void acelerar() {
		System.out.println("El vehículo está acelerando.");
	}

	public void frenar() {
		System.out.println("El vehículo se ha detenido.");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Vehiculo vehiculo = (Vehiculo) obj;
		return matricula == vehiculo.matricula;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}
}
