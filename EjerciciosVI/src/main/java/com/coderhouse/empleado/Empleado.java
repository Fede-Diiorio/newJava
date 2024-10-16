package com.coderhouse.empleado;

import java.util.Objects;

public abstract class Empleado {

	// Atributos
	private String nombre;
	private int sueldoPorHora;
	private int identificacion;

	// Constructor
	public Empleado(String nombre, int salarioPorHora, int identificacion) {
		validarSalarioPorHora(salarioPorHora);
		this.sueldoPorHora = salarioPorHora;
		this.nombre = nombre;
		this.identificacion = identificacion;
	}

	// GET y SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalarioPorHora() {
		return sueldoPorHora;
	}

	public void setSalarioPorHora(int salarioPorHora) {
		validarSalarioPorHora(salarioPorHora);
		this.sueldoPorHora = salarioPorHora;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		if(identificacion <= 0) {
			throw new IllegalArgumentException("La identificación debe ser un número positivo mayor a cero.");
		}
		this.identificacion = identificacion;
	}

	// Métodos
	private void validarSalarioPorHora(int salario) {
		if (salario <= 0) {
			throw new IllegalArgumentException("No puede ingresar un salario menor o igual a cero.");
		}
	}

	public abstract double calcularSalario();
	
	public abstract String trabajar();

	@Override
	public int hashCode() {
		return Objects.hash(identificacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return identificacion == other.identificacion;
	}

}
