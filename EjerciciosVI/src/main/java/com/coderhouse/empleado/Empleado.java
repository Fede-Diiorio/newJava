package com.coderhouse.empleado;

public abstract class Empleado {

	// Atributos
	private String nombre;
	private int sueldoPorHora;

	// Constructor
	public Empleado(String nombre, int salarioPorHora) {
		validarSalarioPorHora(salarioPorHora);
		this.sueldoPorHora = salarioPorHora;
		this.nombre = nombre;
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

	// Métodos
	private void validarSalarioPorHora(int salario) {
		if (salario <= 0) {
			throw new IllegalArgumentException("No puede ingresar un salario menor o igual a cero.");
		}
	}

	public abstract double calcularSalario();
	
	public abstract String trabajar();

}
