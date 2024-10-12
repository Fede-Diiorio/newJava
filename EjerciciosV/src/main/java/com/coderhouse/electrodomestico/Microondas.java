package com.coderhouse.electrodomestico;

public class Microondas extends Electrodomestico {

	@Override
	public void apagar() {
		System.out.println("Tu comida ahora está caliente.");
		super.apagar();
	}
}
