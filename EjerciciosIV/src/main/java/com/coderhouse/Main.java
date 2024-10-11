package com.coderhouse;

import com.coderhouse.objetos.*;

public class Main {

	public static void main(String[] args) throws Exception {

		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		Coche coche1 = new Coche();
		coche1.setMarca("Ford");
		coche1.setModelo("Mustang");
		coche1.setAnio(2024);
		coche1.imprimirDatos();

		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		Alumno alumno1 = new Alumno();
		alumno1.setNombre("Federico Di Iorio");
		alumno1.setMatricula(3829);
		alumno1.setPromedio(10);
		alumno1.imprimirDatos();
		alumno1.setPromedioDeNotas(6, 7, 10);
		alumno1.calcularPromedioDeNotas();

		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		Calculadora calc1 = new Calculadora();
		calc1.setNumero1(10);
		calc1.setNumero2(5);
		calc1.sumar();

		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		Vehiculo auto1 = new Vehiculo();
		auto1.setConsumoCada100km(5);
		auto1.calcularCombustible(78);

		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		Triangulo triangulo = new Triangulo();
		triangulo.setBase(10);
		triangulo.setAltura(5);
		triangulo.calcularArea();

		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		Tienda tienda = new Tienda();
		tienda.setTotalDeCompra(100);
		tienda.calcularPrecioFinal();

		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		
	}

}
