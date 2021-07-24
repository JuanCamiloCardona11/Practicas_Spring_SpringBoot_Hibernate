package dev.j3c.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dev.j3c.entity.*;

public class Prueba {
	
	public static void imprimirListaCursos(List<Curso> listaCursos) {
		for(Curso curso : listaCursos) {
			System.out.println(curso);
		}
	}
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Profesor.class)
				.addAnnotatedClass(DetalleProfesor.class)
				.addAnnotatedClass(Curso.class)
				.buildSessionFactory();
		Session sesion = factory.getCurrentSession();
		try {
			sesion.beginTransaction();
			
			int idProfesor = 1;
			Profesor profesor = sesion.get(Profesor.class, idProfesor);
			
			System.out.println("Profesor: " + profesor);
			
			System.out.println("Lista de cursos:");
			Prueba.imprimirListaCursos(profesor.getListaCursos());
			
			sesion.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error");
			sesion.getTransaction().rollback();
		} finally { 
			sesion.close();
			factory.close();
		}
	}
}
