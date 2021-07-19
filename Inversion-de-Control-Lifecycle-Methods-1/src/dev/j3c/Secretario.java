package dev.j3c;

public class Secretario implements Empleado{
	
	public Secretario() {}

	@Override
	public void metodoInicializacion() {
		System.out.println("Metodo ejecutado cuando se crea el bean");
	}
	
	@Override
	public void metodoDestruccion() {
		System.out.println("Metodo ejecutado antes de la destruccion del bean");
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
