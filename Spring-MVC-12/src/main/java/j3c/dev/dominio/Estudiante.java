package j3c.dev.dominio;

public class Estudiante {
	private String nombre;
	private String apellido;
	private int edad;
	private String nacionalidad;
	private String lengProgFavorito;
	private String[] sistemasOperativos;
	
	public Estudiante() {		
	}
	
	public Estudiante(String nombre, String apellido, int edad, String nacionalidad, String lengProgFavorito) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.lengProgFavorito = lengProgFavorito;
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

	public String getLengProgFavorito() {
		return this.lengProgFavorito;
	}

	public void setLengProgFavorito(String lengProgFavorito) {
		this.lengProgFavorito = lengProgFavorito;
	}
	
	public String[] getSistemasOperativos() {
		return this.sistemasOperativos;
	}
	
	public String getListaSistemasOperativos() {
		String acum = "";
		for(String so : this.sistemasOperativos) {
			acum += so + "  ";
		}
		return(acum);
	}

	public void setSistemasOperativos(String[] sistemasOperativos) {
		this.sistemasOperativos = sistemasOperativos;
	}

	@Override
	public String toString() {
		return "\nEstudiante [nombre= " + nombre +
			   "\nApellido= " + apellido + 
			   "\nEdad= " + edad + 
			   "\nNacionalidad= " + nacionalidad + 
			   "\nLenguaje de programacion favorito= " + lengProgFavorito +
			   "\nSistemas operativos que domina= " + this.getListaSistemasOperativos() +  
			   "]";
	}
	
	
	
}
