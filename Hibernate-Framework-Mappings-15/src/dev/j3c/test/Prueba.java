package dev.j3c.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dev.j3c.entity.*;

public class Prueba {
	
	public static void imprimirListaCursos(List<Curso> listaCursos) {
		for(Curso curso : listaCursos) {
			System.out.println(curso);
		}
	}
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Profesor.class)
				.addAnnotatedClass(DetalleProfesor.class)
				.addAnnotatedClass(Curso.class)
				.addAnnotatedClass(RevisionCurso.class)
				.addAnnotatedClass(Estudiante.class)
				.buildSessionFactory();
		Session sesion = factory.getCurrentSession();
		try {
			sesion.beginTransaction();
			
			Curso curso1 = new Curso("Curso avanzado de Python","En este curso aprenderas analisis de datos con python");
			Curso curso2 = new Curso("Curso de programacion web HTML, CSS y JS","En este curso aprenderas los fundamentos de programacion web");
			Curso curso3 = new Curso("Curso de programacion orientada a objetos","En este curso aprenderas los fundamentos de POO");
			
			Estudiante estudiante1 = new Estudiante("Pedro","Valencia","pedro@gmail.com");
			Estudiante estudiante2 = new Estudiante("Luis","Quiceno","luis12@gmail.com");
			Estudiante estudiante3 = new Estudiante("Andrea","Lopez","andre-lopez@gmail.com");
			Estudiante estudiante4 = new Estudiante("Ana","Carmona","ana-carmona2@gmail.com");
			
			sesion.save(curso1);
			sesion.save(curso2);
			sesion.save(curso3);
			
			curso1.agregarEstudiante(estudiante1);
			curso1.agregarEstudiante(estudiante2);
			curso1.agregarEstudiante(estudiante4);
			
			curso2.agregarEstudiante(estudiante1);
			curso2.agregarEstudiante(estudiante2);
			curso2.agregarEstudiante(estudiante3);
			
			curso3.agregarEstudiante(estudiante2);
			curso3.agregarEstudiante(estudiante4);
			
			sesion.save(estudiante1);
			sesion.save(estudiante2);
			sesion.save(estudiante3);
			sesion.save(estudiante4);
			
			Curso curso = sesion.get(Curso.class, 1);
			
			System.out.println("Curso a eliminar: " + curso);
			
			//Eliminamos el curso -> Hibernate eliminara el curso, y en la tabla de relaciones se eliminaran
			//Todas las referencias al curso eliminado, pero no se eliminan los estudiantes que habian en el curso.
			sesion.delete(curso);
		
			sesion.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace(System.out);
			sesion.getTransaction().rollback();
		} finally { 
			sesion.close();
			factory.close();
		}
	}
}
