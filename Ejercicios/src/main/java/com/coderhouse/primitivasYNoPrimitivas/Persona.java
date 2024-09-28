package com.coderhouse.primitivasYNoPrimitivas;

public class Persona {
    int edad;
    double altura;

    // Constructor para inicializar las variables
    public Persona(int edad, double altura) {
        this.edad = edad;
        this.altura = altura;
    }

    // Método para mostrar los datos de la persona
    public void mostrarDatos() {
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
    }
}

