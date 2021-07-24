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
			
			int idCurso = 3;
			
			Curso curso = sesion.get(Curso.class, idCurso);	

			System.out.println("El curso obtenido es: " + curso);
			System.out.println("\nOpiniones del curso:");
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
