package com.coderhouse.objetos;

public class Tienda {

	// Atributos
	private float totalDeCompra;

	// Constante

	private static final int PORCENTAJE_DE_DESCUENTO = 10;
	private static final int IVA = 21;

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

	public void calcularPrecioFinal() {
		float descuento = (100 - PORCENTAJE_DE_DESCUENTO) / 100f;
		float calcularIva = getTotalDeCompra() * (IVA / 100f);
		float precioFinal = getTotalDeCompra() * descuento;
		System.out.println("Descuento: %" + PORCENTAJE_DE_DESCUENTO);
		System.out.println("IVA: %" + IVA);
		System.out.println("Total de compra: $" + getTotalDeCompra());
		System.out.println("Precio con descuento: $" + precioFinal);
		System.out.println("Final + IVA: $ " + (precioFinal + calcularIva));
	}

	public void calcularDescuento(int precio, int porcentajeDeDescuento) throws Exception {
		String mensajeDeError = "Tiene que ingresar un porcentaje de descuento entre 0 y 100.";
		if (porcentajeDeDescuento < 0 || porcentajeDeDescuento > 100) {
			throw new Exception(mensajeDeError);
		} else {
			float descuento = (100 - porcentajeDeDescuento) / 100f;
			float precioFinal = precio * descuento;
			System.out.println("Producto sin descuento: $" + precio);
			System.out.println("Producto con %" + porcentajeDeDescuento + ": $" + precioFinal);
		}
	}
}
