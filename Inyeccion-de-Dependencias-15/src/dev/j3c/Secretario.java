package dev.j3c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Secretario implements Empleado{
	
	@Value("${secretario.telefono}")
	private String telefono;
	
	@Value("${secretario.email}")
	private String email;
	
	public Secretario() {}
	
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
		return ("Soy el secretario, recibo documentos, atiendo llamadas telefónicas y atiendo visitas");
	}

	@Override
	public void registrarSalida() {
		// TODO Auto-generated method stub
		
	}

}
