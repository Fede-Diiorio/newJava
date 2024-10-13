package com.coderhouse.cuenta;

import java.util.Objects;

public class CuentaBancaria {

	// Atributos
	private double saldo;
	private String titular;
	private int numeroCuenta;

	private static final String MENSAJE_ERROR_SALDO  = "No puede ingresar un número menor a 0.";
	
	public CuentaBancaria (double saldo, int numeroCuenta) {
		validarSaldo(saldo);
		validarNumeroCuenta(numeroCuenta);
		this.saldo = saldo;
		this.numeroCuenta = numeroCuenta;
	}
	
	// Método privado para validar saldo
	private void validarSaldo(double saldo) {
	    if (saldo < 0) {
	        throw new IllegalArgumentException(MENSAJE_ERROR_SALDO);
	    }
	}

	// Método privado para validar número de cuenta
	private void validarNumeroCuenta(int numeroCuenta) {
	    if (numeroCuenta <= 0) {
	        throw new IllegalArgumentException(MENSAJE_ERROR_SALDO);
	    }
	}

	// GET y SET
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		validarSaldo(saldo);
		this.saldo = saldo;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		validarNumeroCuenta(numeroCuenta);
		this.numeroCuenta = numeroCuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	// Métodos
	public void depositar(int deposito) {
		if (deposito < 0) {
			throw new IllegalArgumentException(MENSAJE_ERROR_SALDO );
		} else {
			double total = getSaldo() + deposito;
			setSaldo(total);
			System.out.println("Su saldo es de: $" + getSaldo());
		}
	}

	public void retirar(int retiro) {
		if (retiro > getSaldo()) {
			throw new SaldoInsuficienteException("No se puede realizar la operación");
		} else {
			double nuevoSaldo = getSaldo() - retiro;
			setSaldo(nuevoSaldo);
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
		CuentaBancaria cuenta = (CuentaBancaria) obj;
		return numeroCuenta == cuenta.numeroCuenta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroCuenta);
	}

}
