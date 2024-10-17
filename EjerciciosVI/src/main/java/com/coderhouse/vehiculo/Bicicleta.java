package com.coderhouse.vehiculo;

public class Bicicleta extends Vehiculo {

	public Bicicleta(String marca, String modelo) {
		super(marca, modelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arrancar() {
		System.out.println("Es una bicicleta...");
	}
	
	@Override
	public void mover() {
		System.out.println("El ciclista está pedaleando como loco.");
	}
}
