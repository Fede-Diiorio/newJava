package com.coderhouse.objetos;

public class Rectangulo {

	// Atributos
	private int base;
	private int altura;

	String errorDeDato = "Ni la base ni la altura puede ser inferior o igual a 0.";

	// Get y Set
	public int getBase() {
		return this.base;
	}

	public void setBase(int base) throws Exception {
		if (base <= 0) {
			throw new Exception(errorDeDato);
		} else {
			this.base = base;
		}
	}

	public int getAltura() throws Exception {
		if (altura <= 0) {
			throw new Exception(errorDeDato);
		} else {
			return this.altura;
		}
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void calcularArea() throws Exception {
		System.out.println("Base: " + getBase());
		System.out.println("Altura: " + getAltura());
		System.out.println("El area del rectangulo es: " + (getAltura() * getBase()));
	}

	public void calcularAreaLocal(int base, int altura) throws Exception {
		if (base <= 0 || altura <= 0) {
			throw new Exception(errorDeDato);
		} else {
			System.out.println("Base: " + base);
			System.out.println("Altura: " + altura);
			System.out.println("El area del rectángulo es: " + (base * altura));
		}
	}

	public double calcularAreaDouble(int base, int altura) throws Exception {
		if (base <= 0 || altura <= 0) {
			throw new Exception(errorDeDato);
		} else {
			System.out.println("Base: " + base);
			System.out.println("Altura: " + altura);
			System.out.println("El area del rectángulo es: " + (base * altura));
			double area = base * altura;
			return area;
		}
	}

}
