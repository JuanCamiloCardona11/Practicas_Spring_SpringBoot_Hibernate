package dev.j3c.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dev.j3c.entity.DetalleProfesor;
import dev.j3c.entity.Profesor;

public class Prueba {
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Profesor.class)
				.addAnnotatedClass(DetalleProfesor.class)
				.buildSessionFactory();
		Session sesion = factory.getCurrentSession();
		try {
			//Se crean los objetos
			DetalleProfesor detalleProfesor1 = new DetalleProfesor("https://www.youtube.com/armando-main","Leer y escribir");
			Profesor profesor1 = new Profesor("Armando","Marin","armando.mar235@j3c.dev");
			
			DetalleProfesor detalleProfesor2 = new DetalleProfesor("https://www.youtube.com/tutoriales-gratis","Disfrutar tiempo con sus hijos");
			Profesor profesor2 = new Profesor("Pedro","Cardona","pedro.cardo1@j3c.dev");
			
			DetalleProfesor detalleProfesor3 = new DetalleProfesor("https://www.youtube.com/la-cocina-de-juan","cocinar");
			Profesor profesor3 = new Profesor("Juan","Grisales","juan-grisales333@j3c.dev");
			
			//Se asocian los objetos
			profesor1.setDetalleInstructor(detalleProfesor1);
			profesor2.setDetalleInstructor(detalleProfesor2);
			profesor3.setDetalleInstructor(detalleProfesor3);
			sesion.beginTransaction();
			
			//Guardara el objeto profesor y tambien sus objetos asociados (DetalleProfesor) -> Cascade Insert			
			sesion.save(profesor1);
			sesion.save(profesor2);
			sesion.save(profesor3);

			System.out.println("\nProfesor guardado en la BD: " + profesor1 + ", Tambien Hibernate agrego un id autoincremental: " + profesor1.getId());
			System.out.println("Profesor guardado en la BD: " + detalleProfesor1 + ", Tambien Hibernate agrego un id autoincremental: " + detalleProfesor1.getId());
			
			System.out.println("\nProfesor guardado en la BD: " + profesor2 + ", Tambien Hibernate agrego un id autoincremental: " + profesor2.getId());
			System.out.println("Profesor guardado en la BD: " + detalleProfesor2 + ", Tambien Hibernate agrego un id autoincremental: " + detalleProfesor2.getId());
			
			System.out.println("\nProfesor guardado en la BD: " + profesor3 + ", Tambien Hibernate agrego un id autoincremental: " + profesor3.getId());
			System.out.println("Profesor guardado en la BD: " + detalleProfesor3 + ", Tambien Hibernate agrego un id autoincremental: " + detalleProfesor3.getId());
			sesion.getTransaction().commit();
		} catch (Exception e) {
			sesion.getTransaction().rollback();
		} finally { 
			sesion.close();
			factory.close();
		}
	}
}
