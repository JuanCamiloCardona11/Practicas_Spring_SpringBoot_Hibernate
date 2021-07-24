package dev.j3c.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dev.j3c.entity.*;

public class Prueba {
	
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
			
			Curso curso1 = new Curso("Spring & Hibernate","En este curso aprenderas todos los conceptos de Spring y Hibernate");
			Curso curso2 = new Curso("The MEAN Stack","En este curso aprenderas todos los conceptos de Mongo DB, Express, Angular y Node JS");
			
			profesor.agregarCurso(curso1);
			profesor.agregarCurso(curso2);
			
			sesion.save(curso1);
			sesion.save(curso2);
			
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
