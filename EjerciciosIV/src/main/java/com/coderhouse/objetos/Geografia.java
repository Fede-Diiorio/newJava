package com.coderhouse.objetos;

public class Geografia {

	private static final double RADIO_TIERRA = 6371.0; // en km

	public void calcularCircunferencia() {
		double circunferencia = 2 * Math.PI * RADIO_TIERRA;
		System.out.println("La circunferencia de la Tierra es: " + circunferencia + " km");
	}
}
