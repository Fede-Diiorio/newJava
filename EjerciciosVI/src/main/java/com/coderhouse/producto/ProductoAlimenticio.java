package com.coderhouse.producto;

public class ProductoAlimenticio extends Producto {

    private double descuentoAlimenticio = 0.90; // Ejemplo de descuento del 10% para productos alimenticios

    public ProductoAlimenticio(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double calcularPrecio() {
        // El precio final incluye el descuento
        return getPrecio() * descuentoAlimenticio;
    }
}
