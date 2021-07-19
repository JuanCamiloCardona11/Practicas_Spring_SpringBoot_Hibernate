package dev.j3c;

public class Contador implements Empleado {
	
	private String telefono;
	private String email;
	
	public Contador() {}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		System.out.println("Inyectando el valor del campo telefono - Field Inyection");		
		this.telefono = telefono;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Inyectando el valor del campo email - Field Inyection");
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
		return ("Soy el contador, controlo los estados financieros, y realizo transacciones contables.");
	}

	@Override
	public void registrarSalida() {
		// TODO Auto-generated method stub
		
	}

}
