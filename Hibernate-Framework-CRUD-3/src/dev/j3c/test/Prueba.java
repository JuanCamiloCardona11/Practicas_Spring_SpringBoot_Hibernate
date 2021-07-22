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
			
			sesion.beginTransaction();
			
			Estudiante maria = new Estudiante("Maria","Carvajal","mari.carva@j3c.dev");
			
			sesion.save(maria);
			
			System.out.println("Id generado por Hibernate" + maria.getId());
			
			sesion.getTransaction().commit();
			
			//--- Inicia una nueva transaccion ---
			
			sesion.beginTransaction();
			
			Estudiante estudiante1 = sesion.get(Estudiante.class, 1);
			
			System.out.println("Estudiante recuperado de la BD: " + estudiante1);
			
			Estudiante estudiante2 = sesion.get(Estudiante.class, 50);
			
			//Si no lo encuentra, retorna null
			System.out.println("Estudiante recuperado de la BD: " + estudiante2);
			
			sesion.getTransaction().commit();
			
		} catch (Exception e) {
			sesion.getTransaction().rollback();
		} finally {
			sesion.close();
			factory.close();
		}
	}
}
