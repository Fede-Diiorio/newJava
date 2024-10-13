package com.coderhouse.archivos;

import java.io.*;

public class Archivos {

    // Método que lanza FileNotFoundException si el archivo no existe
    public void leerArchivo(String rutaArchivo) throws FileNotFoundException {
        File archivo = new File(rutaArchivo);

        if (!archivo.exists()) {
            throw new FileNotFoundException("El archivo no fue encontrado: " + rutaArchivo);
        }

        System.out.println("El archivo existe: " + rutaArchivo);
    }

    // Método que lanza IOException al leer un archivo
    public void leerArchivoConIOException(String rutaArchivo) throws IOException {
        File archivo = new File(rutaArchivo);

        // Verifica si el archivo existe antes de intentar leer
        if (!archivo.exists()) {
            throw new FileNotFoundException("El archivo no fue encontrado: " + rutaArchivo);
        }

        // Intentar leer el archivo, podría lanzar IOException
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            throw new IOException("Ocurrió un error al leer el archivo: " + rutaArchivo, e);
        }
    }
}
