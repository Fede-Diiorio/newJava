package com.coderhouse;

import com.coderhouse.calculadora.Calculadora;
import com.coderhouse.computadora.*;
import com.coderhouse.instrumento.*;
import com.coderhouse.persona.Estudiante;
import com.coderhouse.producto.DescuentoInvalidoException;
import com.coderhouse.producto.Producto;
import com.coderhouse.registro.Registro;
import com.coderhouse.vehiculo.Moto;
import com.coderhouse.cuenta.*;
import com.coderhouse.electrodomestico.Microondas;
import com.coderhouse.electrodomestico.Televisor;

public class Main {

	public static void main(String[] args) throws Exception {

		Calculadora calc = new Calculadora();
		try {
			double test = calc.calcularRaizCuadrada(9);
			System.out.println(test);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Programa terminado!");
		}

//		System.out.println("Factorial");
//		double testII = calc.calcularFactorial(5);
//		System.out.println(testII);
//		
//		System.out.println("");
//		System.out.println("Registro");
//		Registro registro = new Registro();
//		registro.agregar("registro1");
//		registro.agregar("registro2");
//		registro.agregar("registro3");
//		registro.obtenerElemento(0);
//		registro.obtenerElemento(5);

	}

}
