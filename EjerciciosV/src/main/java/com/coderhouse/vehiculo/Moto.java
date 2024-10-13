package com.coderhouse.vehiculo;

public class Moto extends Vehiculo {

	// Métodos

	public Moto(String marca, String modelo, String color, int velocidad) {
		super(marca, modelo, color, velocidad);
		// TODO Auto-generated constructor stub
	}

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
