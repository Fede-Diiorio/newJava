package com.coderhouse.figura;

public class Cuadrado extends Figura {

	@Override
	public void calcularArea() {
		System.out.println("El área del cuadrado es: " + (getBase() * getBase()));
	}
}
