package dev.j3c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gerente implements Empleado {

	private Reporte reporte;
	
	public Gerente() {}
	
	@Autowired
	public Gerente(Reporte reporte) {
		this.reporte = reporte;
	}
	
	@Override
	public void setReporte(Reporte reporte) {
		this.reporte = reporte;
	}
	
	public Reporte getReporte() {
		return reporte;
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
		return ("Soy el gerente, planifico, organizo y coordino el trabajo de la empresa");
	}

	@Override
	public void registrarSalida() {
		// TODO Auto-generated method stub
		
	}
	
}
