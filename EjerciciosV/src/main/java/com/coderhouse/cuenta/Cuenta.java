package com.coderhouse.cuenta;

public class Cuenta {

	// Atributos
	private double saldo;
	private String titular;

	String mensajeDeError = "No puede ingresar un número mayor a 0.";

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

}
