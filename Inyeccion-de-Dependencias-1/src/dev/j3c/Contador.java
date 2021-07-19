package dev.j3c;

public class Contador implements Empleado {

	private Reporte reporte;
	
	public Contador() {}
	
	public Contador(Reporte reporte) {
		System.out.println("Inyectando una referencia de la clase Reporte en el constructor...");
		this.reporte = reporte;
	}
	
	public Reporte getReporte() {
		return reporte;
	}

	public void setReporte(Reporte reporte) {
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
