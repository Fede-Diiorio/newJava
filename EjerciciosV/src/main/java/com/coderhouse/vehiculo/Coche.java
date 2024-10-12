package com.coderhouse.vehiculo;

public class Coche extends Vehiculo {

	@Override
	public void arrancar() {
		System.out.println("El coche está arrancando con su prorpio motor.");
	}

	@Override
	public void acelerar() {
		System.out.println("La coche acelera hasta 100 km/h");
	}

	@Override
	public void frenar() {
		System.out.println("El coche se ha detenido en 100 metros.");
	}
}
