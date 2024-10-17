package com.coderhouse.producto;

public class ProductoElectronico extends Producto {

    private double impuestoElectronico = 1.21; // Ejemplo de impuesto del 21% sobre productos electrónicos

    public ProductoElectronico(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double calcularPrecio() {
        // El precio final incluye el impuesto
        return getPrecio() * impuestoElectronico;
    }
}
