package dev.j3c;

import org.springframework.stereotype.Component;

@Component
public class ReporteVentas implements Reporte {

	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return ("Reporte semanal de ventas");
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return ("Este reporte contiene balances de ventas en la ultima semana");
	}
	
}
