package com.coderhouse.banco;

public class CuentaAhorro extends Banco {

	// Attributes
	private double tasaInteres;
	
	public CuentaAhorro(String titular, double saldoInicial, double tasaInteres) {
        super(titular, saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

}
