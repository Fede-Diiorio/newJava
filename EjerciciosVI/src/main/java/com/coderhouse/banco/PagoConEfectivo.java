package com.coderhouse.banco;

import com.coderhouse.interfaces.PagoInterface;

public class PagoConEfectivo implements PagoInterface {

	@Override
	public void realizarPago(double pago) {
		System.out.println("Pagaste en efectivo la cantidad de: $" + pago);

	}

}
