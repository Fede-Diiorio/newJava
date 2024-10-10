package com.coderhouse.objetos;

public class CuentaBancaria {
	// Atributos
	private float saldo;
	private String titular;

	// Estáticas
	private static final int INTERES_NOMINAL_ANUAL = 16;

	// Getters y Setters
	public float getSaldo() {
		return this.saldo;
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
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	// Métodos

	public void imprimirDatos() {
		System.out.println("El saldo de " + getTitular() + " es de: " + getSaldo());
	}

	public void calcularInteresDeEsteMes() {
		float interesDeUnMes = (INTERES_NOMINAL_ANUAL / 12f) / 100;
		float calculoDeIntereses = getSaldo() + (getSaldo() * interesDeUnMes);
		System.out.println("Estimado " + getTitular() + ", a final del més usted contará con: $" + calculoDeIntereses);
	}

	public void mostrarSaldo() {
		System.out.println("Su saldo es de: $" + getSaldo());
	}

	public static float calcularInteresParaUnMes(float dinero) throws Exception {
		String error = "La cantidad de dinero ingresada debe ser mayor a 0.";
		if (dinero < 0) {
			throw new Exception(error);
		} else {
			float interesDeUnMes = (INTERES_NOMINAL_ANUAL / 12f) / 100;
			return dinero + (dinero * interesDeUnMes);
		}
	}

}
