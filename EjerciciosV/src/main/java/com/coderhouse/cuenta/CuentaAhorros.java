package com.coderhouse.cuenta;

public class CuentaAhorros extends CuentaBancaria {

	public CuentaAhorros(double saldo, int numeroCuenta) {
		super(saldo, numeroCuenta);
		// TODO Auto-generated constructor stub
	}

	// Constantes
	private static final int INTERES_NOMINAL_ANUAL = 16;

	public void calcularInteresMensual() {
		double interesMensual = INTERES_NOMINAL_ANUAL / 100f;
		double montoMasIntereses = getSaldo() * (1 + (interesMensual / 12));
		System.out.println("A fin de este mes usted contará con: $" + montoMasIntereses);
	}

}
