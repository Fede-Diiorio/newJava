package com.coderhouse.vehiculo;

public class Moto extends Vehiculo {

	@Override
	public void arrancar() {
		System.out.println("Haz dado una patada.");
		super.arrancar();
	}
}
