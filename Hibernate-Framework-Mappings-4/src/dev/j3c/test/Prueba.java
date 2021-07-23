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
			
			int idDetalle = 2;
			//Obtenemos el detalle del profesor con id=2 
			DetalleProfesor detalleProfesor = sesion.get(DetalleProfesor.class, idDetalle);
			
			//Eliminamos el detalle -> Tambien eliminara el profesor correspondiente (Cascade Delete)
			if(detalleProfesor != null) {
				sesion.delete(detalleProfesor);
				System.out.println("Se ha eliminado el detalle y su respectivo profesor");
			} else {
				System.out.println("No se ha encontrado el detalle con id: " + idDetalle);
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
