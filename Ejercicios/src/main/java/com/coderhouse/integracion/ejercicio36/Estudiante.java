package com.coderhouse.integracion.ejercicio36;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private ArrayList<Integer> notas;

    // Constructor
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    // Método para agregar una nota al estudiante
    public void agregarNota(int nota) {
        if (nota >= 1 && nota <= 10) {
            notas.add(nota);
        } else {
            System.out.println("La nota debe estar entre 1 y 10.");
        }
    }

    // Método para calcular el promedio de las notas
    public double calcularPromedio() {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return notas.size() > 0 ? (double) suma / notas.size() : 0;
    }

    // Método para mostrar el nombre del estudiante y su promedio
    public void mostrarPromedio() {
        System.out.println("Estudiante: " + nombre + " - Promedio: " + calcularPromedio());
    }
}
