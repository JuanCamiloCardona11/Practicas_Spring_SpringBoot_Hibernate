package dev.j3c;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prueba {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleado empleado1 = context.getBean("miEmpleado", Empleado.class);
		Empleado empleado2 = context.getBean("miEmpleado", Empleado.class);
		
		if(empleado1 == empleado2) {
			System.out.println("Los empleados son iguales -> Scope singleton");
		} else {
			System.out.println("Los empleados son diferentes -> Scope prototype");
		}
		
		context.close();
	
	}
}
