package com.coderhouse.figura;

public class Cuadrado extends Figura {

	public Cuadrado(int base, int altura, int radio) {
		super(base, altura, radio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularArea() {
		System.out.println("El área del cuadrado es: " + (getBase() * getBase()));
	}
}
