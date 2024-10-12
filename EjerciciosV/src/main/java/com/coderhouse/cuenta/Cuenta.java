package com.coderhouse.cuenta;

import java.util.Objects;

import com.coderhouse.persona.Persona;

public class Cuenta {

	// Atributos
	private double saldo;
	private String titular;
	private int numeroCuenta;

	String mensajeDeError = "No puede ingresar un número menor a 0.";

	// GET y SET
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) throws Exception {
		if (saldo < 0) {
			throw new Exception(mensajeDeError);
		} else {
			this.saldo = saldo;
		}
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) throws Exception {
		if (numeroCuenta <= 0) {
			throw new Exception(mensajeDeError);
		} else {
			this.numeroCuenta = numeroCuenta;
		}
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	// Métodos
	public void depositar(int deposito) throws Exception {
		if (deposito < 0) {
			throw new Exception(mensajeDeError);
		} else {
			double total = getSaldo() + deposito;
			setSaldo(total);
			System.out.println("Su saldo es de: $" + getSaldo());
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Cuenta cuenta = (Cuenta) obj;
		return numeroCuenta == cuenta.numeroCuenta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroCuenta);
	}

}
