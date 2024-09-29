package com.ejemplo;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Estudiante
        Estudiante estudiante1 = new Estudiante("Fede Di Iorio", 8);
        
        // Mostrar los datos del estudiante
        estudiante1.mostrarDatosCompletos();
        
        // Verificar si el estudiante ha aprobado
        estudiante1.estaAprobado();

        // Llamar al método estático calcularCuadrado de la clase Ejemplo
        int numero = 6;
        int cuadrado = Ejemplo.calcularCuadrado(numero);
        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
    }
}
