package dev.j3c;

import org.springframework.stereotype.Component;

@Component
public class ReporteEmpleado implements Reporte {

	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return ("Reporte de un empleado");
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return ("Reporte diario para los empleados de la empresa, contiene mucha informacion de importancia");
	}

}
