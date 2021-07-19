package dev.j3c;

public class Secretario implements Empleado{

	private Reporte reporte;
	
	public Secretario() {}
	
	public Secretario(Reporte reporte) {
		System.out.println("Inyectando una referencia de la clase Reporte en el constructor...");
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
		return ("Soy el secretario, recibo documentos, atiendo llamadas telefónicas y atiendo visitas");
	}

	@Override
	public void registrarSalida() {
		// TODO Auto-generated method stub
		
	}

}
