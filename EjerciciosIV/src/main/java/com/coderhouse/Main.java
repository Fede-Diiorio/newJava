package com.coderhouse;

import com.coderhouse.objetos.Persona;

public class Main {

	public static void main(String[] args) throws Exception {

		Persona persona1 = new Persona();

		persona1.setNombre("Federico");
		persona1.setEdad(28);
		persona1.imprimirDatos();
	}

}
