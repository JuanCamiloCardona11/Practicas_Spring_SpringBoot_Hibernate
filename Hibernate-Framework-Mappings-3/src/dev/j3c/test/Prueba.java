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
				.buildSessionFactory();
		Session sesion = factory.getCurrentSession();
		try {
			sesion.beginTransaction();
			
			int idDetalle = 10;
			
			DetalleProfesor detalleProfesor = sesion.get(DetalleProfesor.class, idDetalle);
			
			if(detalleProfesor != null) {
				System.out.println("El detalle del profesor es: " + detalleProfesor);
				System.out.println("El profesor es: " + detalleProfesor.getProfesor());
			} else {
				System.out.println("El detalle con id: " + idDetalle + " no existe");
			}
			
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
