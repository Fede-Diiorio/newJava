package com.coderhouse.objetos;

public class Fisica {

    // Constantes
    private static final double VELOCIDAD_LUZ = 299792458; // Metros/segundo
    private static final double GRAVEDAD = 9.81; // m/s², valor en la Tierra

    public void mostrarVelocidadLuz() {
        System.out.println("La velocidad de la luz tiene un valor de " + VELOCIDAD_LUZ + " metros por segundo.");
    }

    public void calcularFuerzaGravitatoria(double masa1, double masa2, double distancia) {
        if (distancia == 0) {
            throw new IllegalArgumentException("La distancia no puede ser cero.");
        }
        double fuerza = GRAVEDAD * (masa1 * masa2) / (distancia * distancia);
        System.out.println("La fuerza gravitatoria entre los objetos es: " + fuerza + " N");
    }
}
