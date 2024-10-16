package com.coderhouse.producto;

import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(nombre, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

	@Override
	public String toString() {
		if (precio == 0.0) {
			return "Producto [nombre=" + nombre + ", precio= no establecido]";
		}
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}

}
