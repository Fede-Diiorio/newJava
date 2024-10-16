package com.coderhouse.banco;

public class CuentaCorriente extends Banco {
	
	// Attributes
	private double sobregiro;

	// Constructor
	public CuentaCorriente(String titular, double saldoInicial, double sobregiro) {
		super(titular, saldoInicial);
		this.sobregiro = sobregiro;
	}

	//GET y SET
	public double getSobregiro() {
		return sobregiro;
	}

	public void setSobregiro() {
		double sobregiro = getSaldo() * 0.25d;
		this.sobregiro = sobregiro;
	}

	
}
