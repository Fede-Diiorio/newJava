package com.coderhouse.ciudad;

import java.util.Objects;

public class Ciudad {

	// Atributos
	private String nombre;
	private int codigoPostal;

	// GET y SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) throws Exception {
		String mensajeDeError = "Tiene que ingresar un valor mayor a 0.";
		if (codigoPostal <= 0) {
			throw new Exception(mensajeDeError);
		} else {
			this.codigoPostal = codigoPostal;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ciudad ciudad = (Ciudad) obj;
        return codigoPostal == ciudad.codigoPostal; 
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(codigoPostal);
	}
}
