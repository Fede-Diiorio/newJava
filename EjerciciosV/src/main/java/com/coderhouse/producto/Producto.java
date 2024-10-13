package com.coderhouse.producto;

import java.util.Objects;

public class Producto {

	// Atributos
	private double precioBase;
	private String nombre;
	private int codigo;

	private String mensajeDeError = "Tiene que ingresar un valor mayor a 0.";

	public Producto(double precio, int codigo) {
		validarPrecioBase(precio);
		validarCodigo(codigo);
		this.precioBase = precio;
		this.codigo = codigo;
	}

	private void validarPrecioBase(double precio) {
		if (precioBase <= 0) {
			throw new IllegalArgumentException(mensajeDeError);
		}
	}

	private void validarCodigo(int codigo) {
		if (codigo <= 0) {
			throw new IllegalArgumentException(mensajeDeError);
		}
	}

	// GET y SET
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		validarPrecioBase(precioBase);
		this.precioBase = precioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) throws Exception {
		validarCodigo(codigo);
		this.codigo = codigo;
	}

	public void aplicarDescuento(int porcentajeDeDescuento) {
		if (porcentajeDeDescuento < 0) {
			throw new DescuentoInvalidoException(mensajeDeError);
		} else {
			double puntoDeDescuento = (100 - porcentajeDeDescuento) / 100d;
			System.out.println("El precio final es: " + (getPrecioBase() * puntoDeDescuento));
		}
	}

	// Metodos
	public double calcularPrecio() {
		return precioBase;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Producto producto = (Producto) obj;
		return codigo == producto.codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

}
