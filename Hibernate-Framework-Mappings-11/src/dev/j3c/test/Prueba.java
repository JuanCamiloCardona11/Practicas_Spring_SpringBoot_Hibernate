package dev.j3c.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dev.j3c.entity.*;

public class Prueba {
	
	public static void imprimirListaCursos(List<RevisionCurso> listaOpiniones) {
		for(RevisionCurso opinion : listaOpiniones) {
			System.out.println(opinion);
		}
	}
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Profesor.class)
				.addAnnotatedClass(DetalleProfesor.class)
				.addAnnotatedClass(Curso.class)
				.addAnnotatedClass(RevisionCurso.class)
				.buildSessionFactory();
		Session sesion = factory.getCurrentSession();
		try {
			sesion.beginTransaction();
			
			Curso curso = new Curso("PHP","Aprende a dominar los conceptos basicos hasta los avanzados de PHP");
			
			curso.agregarRevisionCurso(new RevisionCurso("El curso estuvo genial, me ayudo mucho a entender muchos conceptos"));
			curso.agregarRevisionCurso(new RevisionCurso("El curso esta muy bien elaborado, contiene mucho contenido util"));
			curso.agregarRevisionCurso(new RevisionCurso("El curso es horrible, el profesor no explica bien los conceptos"));
			
			sesion.save(curso);
			
			System.out.println("El curso: " + curso + " ha sido guardado exitosamente.");
			System.out.println("Opiniones del curso:");
			Prueba.imprimirListaCursos(curso.getListaRevisiones());
			
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
