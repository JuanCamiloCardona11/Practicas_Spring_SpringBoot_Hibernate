package dev.j3c.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dev.j3c.entity.Estudiante;

public class Prueba {
	
	public static void imprimirListaEstudiantes(List<Estudiante> listaEstudiantes) {
		for(Estudiante estudiante: listaEstudiantes) {
			System.out.print(estudiante + "\n");
		}
	}
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Estudiante.class)
				.buildSessionFactory();
		
		Session sesion = factory.getCurrentSession();
		
		try {
			sesion.beginTransaction();
			List<Estudiante> listaEstudiantes = new ArrayList<>();
			listaEstudiantes = sesion.createQuery("from Estudiante est where est.nombre='Juan'").getResultList();
			//listaEstudiantes = sesion.createQuery("from Estudiante est where est.nombre='Juan' AND est.apellido='Cardona'").getResultList();
			//listaEstudiantes = sesion.createQuery("from Estudiante est where est.nombre='Juan' OR est.apellido='Osorio'").getResultList();
			//listaEstudiantes = sesion.createQuery("from Estudiante est where est.id>2").getResultList();
			//listaEstudiantes = sesion.createQuery("from Estudiante est where est.id=3").getResultList();
			//listaEstudiantes = sesion.createQuery("from Estudiante est where est.nombre LIKE 'Vale%'").getResultList();
			Prueba.imprimirListaEstudiantes(listaEstudiantes);
			sesion.getTransaction().commit();
			
		} catch (Exception e) {
			sesion.getTransaction().rollback();
		} finally {
			sesion.close();
			factory.close();
		}
	}
}
