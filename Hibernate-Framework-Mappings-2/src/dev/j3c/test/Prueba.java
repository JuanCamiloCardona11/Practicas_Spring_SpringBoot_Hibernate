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
			sesion.beginTransaction();
			
			//Id del profesor a eliminar
			int idProfesor = 2;
			
			//Obtenemos el profesor
			Profesor profesor = sesion.get(Profesor.class, idProfesor);
			
			//Eliminara el objeto profesor y tambien sus objetos asociados (DetalleProfesor) -> Cascade Delete			
			if(profesor != null) {
				sesion.delete(profesor);
				System.out.println("Se ha eliminado exitosamente el profesor y su detalle");
			} else {
				System.out.println("El profesor con id: " + idProfesor + " no existe en el sistema.");
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
