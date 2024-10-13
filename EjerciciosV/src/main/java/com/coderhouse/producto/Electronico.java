package com.coderhouse.producto;

public class Electronico extends Producto {

	public Electronico(double precio, int codigo) {
		super(precio, codigo);
		// TODO Auto-generated constructor stub
	}

	// Atributos
	private int aniosGarantia;

	public int getMesesGarantia() {
		return aniosGarantia;
	}

	public void setMesesGarantia(int aniosGarantia) throws Exception {
		String mensajeDeError = "Tiene que ingresar una cantidad de años superior a 0.";
		if (aniosGarantia <= 0) {
			throw new Exception(mensajeDeError);
		} else {
			this.aniosGarantia = aniosGarantia;
		}
	}

	public double calcularGarantia() {
		double costoGarantia = this.aniosGarantia * 0.10 * getPrecioBase();
		return costoGarantia;
	}

	@Override
	public double calcularPrecio() {
		return getPrecioBase() + calcularGarantia();
	}

}
