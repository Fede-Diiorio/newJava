package com.coderhouse.vehiculo;

import com.coderhouse.interfaces.TransporteInterface;
import com.coderhouse.interfaces.VehiculoInterface;

public class Vehiculo implements VehiculoInterface, TransporteInterface {

	private static final int ANIO_ACTUAL = 2024;

	// Attributes
	private String marca;
	private String modelo;
	private int anio;

	// Constructor
	public Vehiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public Vehiculo(String marca, String modelo, int anio) {
		validarAnio(anio);
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}

	// GET y SET
	public String getMarca() {
		return marca;
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

	public void setAnio(int anio) {
		validarAnio(anio);
		this.anio = anio;
	}

	// Methods
	private void validarAnio(int anio) {
		if (anio < 0 || anio > ANIO_ACTUAL) {
			throw new IllegalArgumentException("Hubo un error al registrar el año.");
		}
	}

	public void arrancar() {
		System.out.println("El vehículo ahora está en marcha.");
	}

	public void mover() {
		System.out.println("El vehículo se mueve.");
	}

	@Override
	public void detener() {
		System.out.println("Ahora el vehículo está detenido.");

	}
}
