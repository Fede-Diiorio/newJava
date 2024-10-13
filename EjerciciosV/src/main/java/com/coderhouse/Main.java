package com.coderhouse;

import com.coderhouse.calculadora.Calculadora;
import com.coderhouse.computadora.*;
import com.coderhouse.instrumento.*;
import com.coderhouse.persona.Estudiante;
import com.coderhouse.producto.DescuentoInvalidoException;
import com.coderhouse.producto.Producto;
import com.coderhouse.vehiculo.Moto;
import com.coderhouse.cuenta.*;
import com.coderhouse.electrodomestico.Microondas;
import com.coderhouse.electrodomestico.Televisor;

public class Main {

	public static void main(String[] args) throws Exception {

		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.setTitular("Juan Perez");
		cuenta.setNumeroCuenta(12345);
		cuenta.depositar(1000);

		try {
			cuenta.retirar(1200);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}

		Producto producto = new Producto();
		producto.setPrecioBase(100);
		try {
			producto.aplicarDescuento(-10);
		} catch (DescuentoInvalidoException e) {
			System.out.println(e.getMessage());
		}

		Calculadora calc = new Calculadora();
		try {
			double test = calc.calcularRaizCuadrada(9);
			System.out.println(test);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
