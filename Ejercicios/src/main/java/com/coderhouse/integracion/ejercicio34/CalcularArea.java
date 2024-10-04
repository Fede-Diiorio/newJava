package com.coderhouse.integracion.ejercicio34;

public class CalcularArea {
	int numero1;
	double NUMERO_PI = Math.PI;

	public CalcularArea(int numero1) {
		this.numero1 = numero1;
	}

	public void calcularAreaDeCirculo() {
		double resultadoCirculo = NUMERO_PI * numero1 * numero1;
		System.out.println("El resultado del área de un circulo de radio " + numero1 + " es: " + resultadoCirculo);
	}

	public void calcularAreaDeCuadrado() {
		float resultadoCuadrado = numero1 * numero1;
		System.out.println("El resultado del área de un cuadrado de base " + numero1 + " es: " + resultadoCuadrado);
	}
}
