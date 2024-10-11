package com.coderhouse.empleado;

public class Gerente extends Empleado {

	// Atributos
	private double porcentajeDeBonificacion;
	private float bonoDePremio;

	private String mensajeDeError = "Tiene que ingresar un valor mayor a 0.";

	// GET y SET
	public double getPorcentajeDeBonificacion() {
		return porcentajeDeBonificacion;
	}

	public void setPorcentajeDeBonificacion(int porcentajeDeBonificacion) throws Exception {
		if (porcentajeDeBonificacion <= 0) {
			throw new Exception(mensajeDeError);
		} else {
			this.porcentajeDeBonificacion = porcentajeDeBonificacion;
		}
	}

	public float getBonoDePremio() {
		return bonoDePremio;
	}

	public void setBonoDePremio(int bonoDePremio) throws Exception {
		if (bonoDePremio <= 0) {
			throw new Exception(mensajeDeError);
		} else {
			this.bonoDePremio = bonoDePremio;
		}
	}

	// Métodos
	public void entregarBonificacionPorBono() {
		System.out.println("Empleado: " + getEmpleado());
		System.out.println("Sueldo: $" + getSueldo());
		System.out.println("Bono: $" + getBonoDePremio());
		System.out.println("Total: $" + (getBonoDePremio() + getSueldo()));
	}

	public void entregarBonificacionPorPorcentaje() {
		double calculoDePorcentaje = (porcentajeDeBonificacion / 100d) + 1;
		System.out.println("Empleado: " + getEmpleado());
		System.out.println("Sueldo: $" + getSueldo());
		System.out.println("Bono del %" + getPorcentajeDeBonificacion());
		System.out.println("Total: $" + (getSueldo() * calculoDePorcentaje));
	}
}
