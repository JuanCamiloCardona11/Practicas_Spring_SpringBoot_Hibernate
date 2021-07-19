package dev.j3c;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Prueba {
	public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpleadoConfig.class);
	
	Empleado gerente = context.getBean("gerente", Empleado.class);
	Empleado contador = context.getBean("contador", Empleado.class);
	Empleado secretario = context.getBean("secretario", Empleado.class);
	
	System.out.println(gerente.describirActividades());
	System.out.println("Telefono Gerente: " + gerente.getTelefono());
	System.out.println("Email Gerente: " + gerente.getEmail() + "\n");
	
	System.out.println(contador.describirActividades());
	System.out.println("Telefono Contador: " + contador.getTelefono());
	System.out.println("Email Contador: " + contador.getEmail() + "\n");
	
	System.out.println(secretario.describirActividades());
	System.out.println("Telefono Secretario: " + secretario.getTelefono());
	System.out.println("Email Secretario: " + secretario.getEmail() + "\n");
	
	context.close();
	
	}
}
