package com.coderhouse.objetos;

public class Tienda {

	// Atributos

	private float totalDeCompra;

	// Constante

	private static final int PORCENTAJE_DE_DESCUENTO = 10;

	public float getTotalDeCompra() {
		return this.totalDeCompra;
	}

	public void setTotalDeCompra(float totalDeCompra) throws Exception {
		String errorDecompra = "El monto tiene que ser superior a 0";

		if (totalDeCompra <= 0) {
			throw new Exception(errorDecompra);
		} else {
			this.totalDeCompra = totalDeCompra;
		}
	}

	public void calcularDescuento() {
		float descuento = (100 - PORCENTAJE_DE_DESCUENTO) / 100f;
		float precioFinal = getTotalDeCompra() * descuento;
		System.out.println("Con un descuento del " + PORCENTAJE_DE_DESCUENTO + "% el precio final es de: $" + precioFinal);
	}
}
