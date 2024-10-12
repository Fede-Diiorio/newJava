package com.coderhouse.usuario;

import java.util.Objects;

public class Usuario {

	// Atributos
	private String username;
	private String email;

	// Get y Set
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws Exception {
		String mensajeDeError = "Ingrese un email válido.";
		if (email.contains("@")) {
			this.email = email;
		} else {
			throw new Exception(mensajeDeError);
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
		Usuario user = (Usuario) obj;
		return email == user.email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

}
