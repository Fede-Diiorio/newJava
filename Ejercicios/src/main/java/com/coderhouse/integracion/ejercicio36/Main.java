package com.coderhouse.integracion.ejercicio36;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear un ArrayList de estudiantes
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // Crear algunos estudiantes y agregar notas
        Estudiante estudiante1 = new Estudiante("Fede");
        estudiante1.agregarNota(9);
        estudiante1.agregarNota(8);
        estudiante1.agregarNota(7);

        Estudiante estudiante2 = new Estudiante("Ana");
        estudiante2.agregarNota(10);
        estudiante2.agregarNota(9);

        Estudiante estudiante3 = new Estudiante("Pedro");
        estudiante3.agregarNota(5);
        estudiante3.agregarNota(6);
        estudiante3.agregarNota(7);

        // Añadir los estudiantes a la lista
        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);

        // Mostrar los promedios de cada estudiante
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarPromedio();
        }
    }
}
