package com.coderhouse.registro;

import java.util.ArrayList;
import java.util.List;

public class Registro {
	// Atributo para almacenar los registros
	private List<String> registros;

	// Constructor
	public Registro() {
		this.registros = new ArrayList<>();
	}

	// Método para agregar un registro
	public void agregar(String registro) {
		if (registros.contains(registro)) {
			throw new RegistroDuplicadoException("El registro '" + registro + "' ya existe.");
		} else {
			registros.add(registro);
			System.out.println("Registro agregado: " + registro);
		}
	}

	// Método para mostrar los registros (opcional)
	public void mostrarRegistros() {
		System.out.println("Registros actuales: " + registros);
	}

	public void obtenerElemento(int indice) {
		try {
			String registro = registros.get(indice);
			System.out.println("Registronico: " + registro);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
