package com.coderhouse.producto;

public class Producto {

	// Atributos
	private String nombre;
	private double precio;

	public Producto(String nombre, double precio) {
		validarPrecio(precio);
		this.nombre = nombre;
		this.precio = precio;
	}

	public Producto(String nombre) {
		this.nombre = nombre;
		this.precio = 0.0;
	}

	private void validarPrecio(double precio) {
		if (precio <= 0) {
			throw new IllegalArgumentException("El precio no puede ser menor o igual a cero.");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		validarPrecio(precio);
		this.precio = precio;
	}

	@Override
	public String toString() {
		if (precio == 0.0) {
			return "Producto [nombre=" + nombre + ", precio= no establecido]";
		}
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}

}
