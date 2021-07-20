package j3c.dev.dominio;

import java.util.HashMap;
import java.util.Map;

public class Estudiante {
	private String nombre;
	private String apellido;
	private int edad;
	private Map<String,String> mapaPaises;
	private String nacionalidad;
	
	public Estudiante() {		
		//Los paises se deberian leer de una bd o de un servicio web
		mapaPaises = new HashMap<>();
		mapaPaises.put("BR", "Brazil");
		mapaPaises.put("CO", "Colombia");
		mapaPaises.put("MX", "Mexico");
		mapaPaises.put("USA", "Estados Unidos");
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre= " + nombre + ", apellido= " + apellido + ", edad= " + edad + ", nacionalidad= " + nacionalidad +"]";
	}
	
	
	
}
