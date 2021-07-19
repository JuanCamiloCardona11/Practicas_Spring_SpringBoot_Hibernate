package dev.j3c;

public interface Empleado {
	void registrarLlegada();
	void iniciarLabores();
	String describirActividades();
	void registrarSalida();
	String getTelefono();
	void setTelefono(String telefono);
	String getEmail();
	void setEmail(String email);
}
