package com.coderhouse.banco;

public class Banco {

	// Attributes
	private String titular;
	private double saldo;

	// Constructor
	public Banco(String titular, double saldoInicial) {
		validarSaldo(saldoInicial);
		this.saldo = saldoInicial;
		this.titular = titular;
	}

	// GET y SET
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

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
			throw new IllegalArgumentException("No puede iniciar su cuenta con un saldo menor a 0.");
		}
	}

	public void crearCuenta() {
		System.out.println("Cuenta creada");
	}

	public void transferir(double transferencia, String destinatario) {
	    if (getSaldo() < transferencia) {
	        throw new IllegalArgumentException("No cuenta con suficientes fondos para realizar esa transferencia.");
	    }
	    
	    if (destinatario == null || destinatario.trim().isEmpty()) {
	        throw new NullPointerException("Debe ingresar un destinatario válido para su transferencia.");
	    }

	    double nuevoSaldo = getSaldo() - transferencia;
	    setSaldo(nuevoSaldo);

	    System.out.println("Transferencia de " + transferencia + " enviada a: " + destinatario);
	}

}
