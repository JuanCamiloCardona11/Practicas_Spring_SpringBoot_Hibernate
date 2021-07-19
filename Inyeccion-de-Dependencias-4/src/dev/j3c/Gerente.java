package dev.j3c;

public class Gerente implements Empleado {
	
	private String telefono;
	private String email;
	
	public Gerente() {}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		System.out.println("Inyectando el valor del campo telefono proveniente un archivo .properties");
		this.telefono = telefono;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Inyectando el valor del campo email proveniente un archivo .properties");
		this.email = email;
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
