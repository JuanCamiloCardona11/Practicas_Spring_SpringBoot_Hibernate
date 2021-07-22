package dev.j3c.test;

import java.util.ArrayList;
import java.util.List;

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
			sesion.beginTransaction();
			sesion.createQuery("update Estudiante set email='email-invalido@gmail.com'");
			sesion.getTransaction().commit();
			
		} catch (Exception e) {
			sesion.getTransaction().rollback();
			System.out.println("Ha habido un error");
		} finally {
			sesion.close();
			factory.close();
		}
	}
}
