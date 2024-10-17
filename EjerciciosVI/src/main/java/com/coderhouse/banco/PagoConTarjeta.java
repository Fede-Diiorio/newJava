package com.coderhouse.banco;

import com.coderhouse.interfaces.PagoInterface;

public class PagoConTarjeta implements PagoInterface {

	@Override
	public void realizarPago(double pago) {
		System.out.println("Pagaste con tarjeta una cantidad de: $" + pago);

	}

}
