package com.coderhouse.vehiculo;

public class Moto extends Vehiculo {

	// Métodos
	
	@Override
	public void acelerar() {
		System.out.println("La motocicleta acelera hasta 120 km/h");
	}
	
	@Override
	public void frenar() {
		super.frenar();
		System.out.println("La motocivleta se ha detenido en 60 metros.");
	}
}
