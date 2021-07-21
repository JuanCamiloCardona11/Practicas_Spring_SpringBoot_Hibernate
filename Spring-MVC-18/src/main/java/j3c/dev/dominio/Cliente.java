package j3c.dev.dominio;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Cliente {
	
	@NotNull(message="Este campo es obligatorio")
	@Size(min=3, message="Minimo 3 caracteres")
	private String nombre;
	
	private String apellido;
	
	@NotNull(message="Este campo es obligatorio")
	@Min(value=4, message="La edad minima aceptada es de 4 anios")
	@Max(value=10, message="La edad maxima aceptada es de 10 anios")
	private Integer edad;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="Solo 5 caracteres aceptados")
	private String codigoPostal;
	
	public Cliente() {
	}
	
	public Cliente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
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

	public Integer getEdad() {
		return this.edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public String getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return "Cliente [nombre= " + nombre + 
			   ", apellido= " + apellido + 
			   ", edad= " + edad + 
			   ", codigoPostal= " + codigoPostal + "]";
	}

	
	
	
}
