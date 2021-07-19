package dev.j3c;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("dev.j3c")
@PropertySource("classpath:info-empleados.properties")
public class EmpleadoConfig {
	
	@Bean
	public Empleado gerente() {
		Empleado empleado = new Gerente();
		return (empleado);
	}
	
	@Bean
	public Empleado contador() {
		Empleado empleado = new Contador();
		return (empleado);
	}
	
	@Bean
	public Empleado secretario() {
		Empleado empleado = new Secretario();
		return (empleado);
	}
	
}
