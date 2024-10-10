package com.coderhouse.objetos;

public class Casa {
	private String direccion;

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void retornarDireccion() {
		System.out.println("Su dirección es: " + getDireccion());
	}

}
