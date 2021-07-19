package dev.j3c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Contador implements Empleado {
	
	@Value("${contador.telefono}")
	private String telefono;
	
	@Value("${contador.email}")
	private String email;
	
	public Contador() {}

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
		return ("Soy el contador, controlo los estados financieros, y realizo transacciones contables.");
	}

	@Override
	public void registrarSalida() {
		// TODO Auto-generated method stub
		
	}

}
