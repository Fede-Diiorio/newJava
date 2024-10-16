package com.coderhouse.vehiculo;

public class Bicicleta extends Vehiculo {

	@Override
	public void arrancar() {
		System.out.println("Es una bicicleta...");
	}
	
	@Override
	public void mover() {
		System.out.println("El ciclista está pedaleando como loco.");
	}
}
