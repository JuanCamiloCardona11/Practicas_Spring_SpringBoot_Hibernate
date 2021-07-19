package dev.j3c;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prueba {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleado empleado = context.getBean("miEmpleado", Empleado.class);
		
		empleado.registrarLlegada();
		empleado.iniciarLabores();
		System.out.print(empleado.describirActividades());
		empleado.registrarSalida();

		context.close();
	}
}
