package dev.j3c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Gerente implements Empleado {
	
	@Value("${gerente.telefono}")
	private String telefono;
	
	@Value("${gerente.email}")
	private String email;

	public Gerente() {}

	public String getTelefono() {
		return (this.telefono);
	}
	
	public String getEmail() {
		return (this.email);
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
