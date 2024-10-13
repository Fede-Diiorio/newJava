package com.coderhouse.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	
	public Connection abrirConexion() throws SQLException {
	    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mi_base_datos", "usuario", "contraseña");
	    return connection;
	}
}
