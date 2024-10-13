package com.coderhouse.figura;

public class Triangulo extends Figura {

	public Triangulo(int base, int altura, int radio) {
		super(base, altura, radio);
		// TODO Auto-generated constructor stub
	}

	@Override
	
	public void dibujar() {
		System.out.println("Dibujaste un triangulo.");
	}
}
