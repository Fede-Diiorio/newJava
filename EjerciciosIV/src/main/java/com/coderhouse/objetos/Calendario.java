package com.coderhouse.objetos;

public class Calendario {

	private static final int MESES_ANO = 12;

	public void calcularMesesRestantes(int mesActual) {
		if (mesActual < 1 || mesActual > MESES_ANO) {
			System.out.println("Mes inválido. Debe ser un valor entre 1 y 12.");
		} else {
			int mesesRestantes = MESES_ANO - mesActual;
			System.out.println("Faltan " + mesesRestantes + " meses para fin de año.");
		}
	}
}
