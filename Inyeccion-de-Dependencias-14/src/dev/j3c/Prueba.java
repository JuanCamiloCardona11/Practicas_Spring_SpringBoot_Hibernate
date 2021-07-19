package dev.j3c;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Prueba {
	public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpleadoConfig.class);
	
	Empleado empleado = context.getBean("gerente", Empleado.class);
	
	System.out.println(empleado.describirActividades());
	System.out.println(empleado.getReporte().getTitulo());
	System.out.println(empleado.getReporte().getDescripcion());
	
	context.close();
	
	}
}
