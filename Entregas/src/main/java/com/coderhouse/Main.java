package com.coderhouse;

import com.coderhouse.persona.Persona;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        // Crear objetos Persona
        Persona persona1 = new Persona("Federico", "Di Iorio");
        Persona persona2 = new Persona("Fiorella", "Di Caprio");
        Persona persona3 = new Persona("Sebastian", "Julachis");
        Persona persona4 = new Persona("Agustin", "Sarquis");
        Persona persona5 = new Persona("Victor", "Frolio");

        // Crear lista de personas
        List<Persona> listaDePersonas = new ArrayList<>();

        // Agregar personas a la lista
        listaDePersonas.add(persona1);
        listaDePersonas.add(persona2);
        listaDePersonas.add(persona3);
        listaDePersonas.add(persona4);
        listaDePersonas.add(persona5);

        // Ordenar por nombre
        Collections.sort(listaDePersonas, Comparator.comparing(Persona::getNombre));
        System.out.println("Ordenado por nombre:");
        listaDePersonas.forEach(persona -> System.out.println(persona.getNombre() + " " + persona.getApellido()));

        // Ordenar por apellido
        Collections.sort(listaDePersonas, Comparator.comparing(Persona::getApellido));
        System.out.println("\nOrdenado por apellido:");
        listaDePersonas.forEach(persona -> System.out.println(persona.getNombre() + " " + persona.getApellido()));

        // Ordenar inversamente por apellido
        Collections.sort(listaDePersonas, Comparator.comparing(Persona::getApellido).reversed());
        System.out.println("\nOrdenado inversamente por apellido:");
        listaDePersonas.forEach(persona -> System.out.println(persona.getNombre() + " " + persona.getApellido()));
    }
}
