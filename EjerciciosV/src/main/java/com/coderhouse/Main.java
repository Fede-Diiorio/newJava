package com.coderhouse;

import com.coderhouse.computadora.*;
import com.coderhouse.instrumento.*;
import com.coderhouse.persona.Estudiante;
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

	}

}
