package com.coderhouse.objetos;

public class ConversorMoneda {

	// Constantes
	private static final float VALOR_EURO = 0.914452929286f;

	public static float convertirDolarAEuro(float dolar) throws Exception {
		String error = "Tiene que ingresar una cantidad de dólares mayor a 0.";
		if (dolar < 0) {
			throw new Exception(error);
		} else {
			return dolar * VALOR_EURO;
		}
	}
}
