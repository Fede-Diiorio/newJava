package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.modelos.Alumno;
import com.coderhouse.modelos.Curso;

@SpringBootApplication
public class Clase08Application {

	@Autowired
	private DaoFactory dao;

	public static void main(String[] args) {
		SpringApplication.run(Clase08Application.class, args);
	}

//	@Override
	public void run(String... arg) throws Exception {
		try {

			Curso curso1 = new Curso("HTML");
			Curso curso2 = new Curso("CSS");
			Curso curso3 = new Curso("JAVA");
			
			dao.createCurso(curso1);
			dao.createCurso(curso2);
			dao.createCurso(curso3);

			Alumno alumno1 = new Alumno("Fede", "Di Iorio", 38831646, "fd38831646");
			Alumno alumno2 = new Alumno("Fiore", "Di Caprio", 38831645, "fd38831645");
			Alumno alumno3 = new Alumno("Ale", "Di Stefano", 38831644, "fd38831644");
			
			dao.createAlumno(alumno1);
			dao.createAlumno(alumno2);
			dao.createAlumno(alumno3);

		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}
}
