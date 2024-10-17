package com.coderhouse.vehiculo;

public class Moto extends Vehiculo {

	public Moto(String marca, String modelo) {
		super(marca, modelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arrancar() {
		System.out.println("Haz dado una patada.");
		super.arrancar();
	}
}
