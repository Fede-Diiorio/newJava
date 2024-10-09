package com.coderhouse;

import com.coderhouse.objetos.Alumno;
import com.coderhouse.objetos.Coche;

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

	}

}
