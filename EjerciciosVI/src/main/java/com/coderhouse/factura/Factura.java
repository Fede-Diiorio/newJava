package com.coderhouse.factura;

public class Factura {

	// Attributes
	private double precio;

	// Constructor
	public Factura(double precio) {
		validarPrecio(precio);
		this.precio = precio;
	}

	// GET y SET
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		validarPrecio(precio);
		this.precio = precio;
	}

	// Methods
	private void validarPrecio(double precio) {
		if (precio < 0) {
			throw new IllegalArgumentException("Tiene que ingresar un valor mayor a cero.");
		}
	}

	public void calcularTotal() {
		System.out.println("El precio sin impuestos es: $ " + getPrecio());
	}

	public void calcularTotal(int descuento) {
		double porcentajeDeDescuento = (100 - descuento) / 100d;
		System.out.println("El precio con descuento es de: $" + (getPrecio() * porcentajeDeDescuento));
	}

	public void calcularTotal(double impuesto) {
		double Impuestos = (impuesto / 100d) + 1d;
		System.out.println("El precio con impuesto es de : $" + getPrecio() * Impuestos);
	}

}
