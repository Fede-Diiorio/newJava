package com.coderhouse.cliente;

public class Cliente {

	// Attributes
	private double saldo;

	// Constructor
	public Cliente(double saldo) {
		validarSaldo(saldo);
		this.saldo = saldo;
	}

	// GET y SET
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		validarSaldo(saldo);
		this.saldo = saldo;
	}

	// Methods
	private void validarSaldo(double saldo) {
		if (saldo < 0) {
			throw new IllegalArgumentException("No puede ingresar un saldo negativo.");
		}
	}

	// Método para retirar dinero (sobrecargado)
	public void retirarDinero(int retiro) {
		retirarDinero((double) retiro);
	}

	public void retirarDinero(double retiro) {
		validarRetiro(retiro);
		this.saldo -= retiro;
	}

	private void validarRetiro(double retiro) {
		if (retiro < 0) {
			throw new IllegalArgumentException("La cantidad a retirar debe ser positiva.");
		}
		if (getSaldo() < retiro) {
			throw new IllegalArgumentException("No puede retirar más dinero del que posee.");
		}
	}
}
