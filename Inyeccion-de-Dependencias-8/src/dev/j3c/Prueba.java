package dev.j3c;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prueba {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Empleado empleado = context.getBean("gerente", Empleado.class);
	
	System.out.println(empleado.describirActividades());
	System.out.println(empleado.getReporte().getTitulo());
	System.out.println(empleado.getReporte().getDescripcion());
	
	context.close();
	
	}
}
