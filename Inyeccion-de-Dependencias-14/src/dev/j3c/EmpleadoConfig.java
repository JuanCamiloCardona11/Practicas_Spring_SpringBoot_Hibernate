package dev.j3c;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("dev.j3c")
public class EmpleadoConfig {
	
	@Bean
	public Reporte reporte() {
		return (new ReporteEmpleado());
	}
	
	@Bean
	public Empleado gerente() {
		Empleado empleado = new Gerente(this.reporte());
		return (empleado);
	}
}
