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

		Portatil portatil = new Portatil();
		Escritorio escritorio = new Escritorio();
		Computadora compu = new Computadora();

		compu.encender();
		portatil.encender();
		escritorio.encender();

		CuentaAhorros cuentaAhorro = new CuentaAhorros();

		cuentaAhorro.setSaldo(900);
		cuentaAhorro.setTitular("Fede Di Iorio");
		cuentaAhorro.depositar(100);
		cuentaAhorro.getSaldo();
		cuentaAhorro.calcularInteresMensual();
		cuentaAhorro.depositar(100);
		cuentaAhorro.calcularInteresMensual();

		System.out.println("");
		Guitarra guitarra = new Guitarra();
		Piano piano = new Piano();
		guitarra.afinar();
		piano.afinar();

	}

}
