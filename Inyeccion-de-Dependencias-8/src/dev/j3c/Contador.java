package dev.j3c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("miContador")
public class Contador implements Empleado {

	private Reporte reporte;
	
	public Contador() {}
	
	public Reporte getReporte() {
		return reporte;
	}

	@Autowired
	public void setReporte(Reporte reporte) {
		//System.out.println("Inyectando referencia de Reporte por medio de metodo setter");
		this.reporte = reporte;
	}

	@Override
	public void registrarLlegada() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarLabores() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String describirActividades() {
		// TODO Auto-generated method stub
		return ("Soy el contador, controlo los estados financieros, y realizo transacciones contables.");
	}

	@Override
	public void registrarSalida() {
		// TODO Auto-generated method stub
		
	}

}
