package com.coderhouse.primitivasYNoPrimitivas;

import java.util.ArrayList; // Importar ArrayList

public class Main {
    public static void main(String[] args) {
        // 1. Crear un objeto de la clase Persona
        Persona persona1 = new Persona(25, 1.75);

        // Mostrar los datos de la persona
        persona1.mostrarDatos();

        // 2. Declarar un arreglo de String para los días de la semana
        String[] diasDeLaSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        
        System.out.println("Días de la semana:");
        for (String dia : diasDeLaSemana) {
            System.out.println(dia);
        }

        // 3. Definir un ArrayList para las edades de los estudiantes
        ArrayList<Integer> edadesEstudiantes = new ArrayList<>(); // Asegúrate de importar ArrayList
        edadesEstudiantes.add(18);
        edadesEstudiantes.add(20);
        edadesEstudiantes.add(22);

        // Mostrar las edades de los estudiantes
        System.out.println("Edades de los estudiantes:");
        for (int edad : edadesEstudiantes) {
            System.out.println(edad);
        }
    }
}