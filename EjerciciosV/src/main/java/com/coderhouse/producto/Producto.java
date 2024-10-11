package com.coderhouse.producto;

public class Producto {
	private double precioBase;

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase)throws Exception {
		String mensajeDeError = "El precio tiene que ser mayor que 0.";
		if(precioBase <= 0) {
			throw new Exception(mensajeDeError);
		} else {
			this.precioBase = precioBase;
		}
	}
	
	public double calcularPrecio() {
		return precioBase;
	}
	
	
}
