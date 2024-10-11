package com.coderhouse.objetos;

public class Producto {

	// Atributos
	private String nombre;
	private float precio;

	// constantes
	private static final float IMPUESTOS = 21;

	// Setters y Getters
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public void impormirDatos() throws Exception {
		String mensajeDeErrorString = "No puede ingresar un número menor a 8";

		if (this.precio < 0) {
			throw new Exception(mensajeDeErrorString);
		} else {
			float valorFinal = getPrecio() * ((IMPUESTOS / 100) + 1);

			System.out.println("Producto: " + getNombre());
			System.out.println("Impuesto: %" + IMPUESTOS);
			System.out.println("Precio simple: $" + getPrecio());
			System.out.println("Total: $" + valorFinal);

		}
	}

	public void calcularDescuento(int precio, int porcentajeDeDescuento) throws Exception {
		String mensajeDeError = "Tiene que ingresar un porcentaje de descuento entre 0 y 100.";
		if (porcentajeDeDescuento < 0 || porcentajeDeDescuento > 100) {
			throw new Exception(mensajeDeError);
		} else {
			float descuento = (100 - porcentajeDeDescuento) / 100f;
			float precioFinal = precio * descuento;
			System.out.println("Producto sin descuento: $" + precio);
			System.out.println("Producto con %" + porcentajeDeDescuento + ": $" + precioFinal);
		}
	}

}
