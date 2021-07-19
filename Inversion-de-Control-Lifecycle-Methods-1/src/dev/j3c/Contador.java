package dev.j3c;

public class Contador implements Empleado {
	
	public Contador() {}

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
		return ("Soy el contador, controlo los estados financieros, y realizo transacciones contables.");
	}

	@Override
	public void registrarSalida() {
		// TODO Auto-generated method stub
		
	}

}
