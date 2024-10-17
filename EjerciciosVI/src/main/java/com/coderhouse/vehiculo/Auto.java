package com.coderhouse.vehiculo;

public class Auto extends Vehiculo {

	public Auto(String marca, String modelo) {
		super(marca, modelo);
		// TODO Auto-generated constructor stub
	}

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
