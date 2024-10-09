package com.coderhouse.objetos;

public class CuentaBancaria {
	// Atributos
	private float saldo;
	private String titular;

	// Getters y Setters
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) throws Exception {
		String mensajeDeError = "Tiene que ingresar un saldo mayor a 0.";
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

	public void imprimirDatos() {
		System.out.println("El saldo de " + getTitular() + " es de: " + getSaldo());
	}

}
