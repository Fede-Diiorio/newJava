package com.coderhouse.figura;

public class Rectangulo extends Figura {

	public Rectangulo(int base, int altura, int radio) {
		super(base, altura, radio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dibujar() {
		System.out.println("Dibujaste un rectangulo.");
	}
}
