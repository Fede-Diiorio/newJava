package com.coderhouse.vehiculo;

public class Auto extends Vehiculo {

	@Override
	public void arrancar() {
		System.out.println("Haz girado la llave.");
		super.arrancar();
	}
	
	@Override
	public void mover() {
		System.out.println("El piloto acelera y avanza.");
	}
}
