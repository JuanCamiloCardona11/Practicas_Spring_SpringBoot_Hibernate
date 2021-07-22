package dev.j3c.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dev.j3c.entity.Estudiante;

public class Prueba {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Estudiante.class)
				.buildSessionFactory();
		
		Session sesion = factory.getCurrentSession();
		
		try {
			Estudiante estudiante = new Estudiante("Juan", "Cardona","juan.cardonq@j3c.dev");
			sesion.beginTransaction();
			sesion.save(estudiante);
			sesion.getTransaction().commit();
			System.out.println("Estudiante ingresado: " + estudiante);
		} catch (Exception e) {
			sesion.getTransaction().rollback();
		} finally {
			sesion.close();
			factory.close();
		}
	}
}
