package com.coderhouse;

import com.coderhouse.figuras.Circulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo circulo = new Circulo(5);
		double test = circulo.calcularArea();
		System.out.println(test);
	}

}
