package dev.j3c;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prueba {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleado empleado = context.getBean("miEmpleado", Empleado.class);
		
		System.out.println(empleado.describirActividades());
		System.out.println("Telefono: " + empleado.getTelefono());
		System.out.println("Email: " + empleado.getEmail());
		context.close();
	
	}
}
