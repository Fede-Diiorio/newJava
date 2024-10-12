package com.coderhouse.cuenta;

public class SaldoInsuficienteException extends RuntimeException {
	public SaldoInsuficienteException(String mensaje) {
		super(mensaje);
	}
}
