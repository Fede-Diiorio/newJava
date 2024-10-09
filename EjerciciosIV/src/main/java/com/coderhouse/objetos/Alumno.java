package com.coderhouse.objetos;

public class Alumno {

    // Atributos
    private String nombre;
    private int matricula;
    private int promedio;

    // Get y Set
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPromedio() {
        return this.promedio;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) throws Exception {
        String errorDeMatricula = "La matrícula debe tener, al menos, 4 dígitos.";
        if (String.valueOf(matricula).length() < 4) {  // Cambiado de <= a < 
            throw new Exception(errorDeMatricula);
        } else {
            this.matricula = matricula;
        }
    }

    public void setPromedio(int promedio) throws Exception {
        String errorDePromedio = "El promedio debe estar entre 1 y 10 inclusive.";
        if (promedio < 1 || promedio > 10) {  // Cambiado de <= 0 y >= 11 a < 1 y > 10
            throw new Exception(errorDePromedio);
        } else {
            this.promedio = promedio;
        }
    }

    // Métodos
    public void imprimirDatos() {
        System.out.println("El alumno " + getNombre() + ", matrícula número " + getMatricula()
                + " tiene un promedio de: " + getPromedio() + ".");
    }
}
