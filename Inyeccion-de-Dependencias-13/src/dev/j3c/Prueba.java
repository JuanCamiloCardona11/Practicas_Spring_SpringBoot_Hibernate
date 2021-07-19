package dev.j3c;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prueba {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Empleado contador1 = context.getBean("contador", Empleado.class);
	Empleado contador2 = context.getBean("contador", Empleado.class);
	
	if(contador1 == contador2) {
		System.out.println("Los contadores son iguales -> Scope singleton");
	} else {
		System.out.println("Los contadores son diferentes -> Scope prototype");
	}
	
	Empleado secretario1 = context.getBean("secretario", Empleado.class);
	Empleado secretario2 = context.getBean("secretario", Empleado.class);
	
	if(secretario1 == secretario2) {
		System.out.println("Los secretarios son iguales -> Scope singleton");
	} else {
		System.out.println("Los secretarios son diferentes -> Scope prototype");
	}
	
	context.close();
	
	}
}
