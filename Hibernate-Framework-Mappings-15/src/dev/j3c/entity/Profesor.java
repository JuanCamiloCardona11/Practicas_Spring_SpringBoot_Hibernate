package dev.j3c.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="profesor")
public class Profesor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="email")
	private String email;
	
	@OneToOne(cascade= {
			CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST,	//Tambien se pueden definir individualmente si es que solo queremos utilizar algunas
			CascadeType.REFRESH,
			CascadeType.REMOVE
	})
	@JoinColumn(name="detalle_profesor_id")
	private DetalleProfesor detalleProfesor;

	@OneToMany(//fetch=FetchType.EAGER,
			   fetch=FetchType.LAZY,
			   mappedBy="profesor", cascade= {
					CascadeType.DETACH,
					CascadeType.MERGE,
				    CascadeType.PERSIST,
					CascadeType.REFRESH,
	})
	private List<Curso> listaCursos;
	
	public Profesor() {
	}
	
	public Profesor(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	
	public Profesor(int id, String nombre, String apellido, String email) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	
	public void agregarCurso(Curso curso) {
		if(this.listaCursos == null) {
			this.listaCursos = new ArrayList<>();
		} 
		curso.setProfesor(this);
		this.listaCursos.add(curso);
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public DetalleProfesor getDetalleInstructor() {
		return this.detalleProfesor;
	}

	public void setDetalleInstructor(DetalleProfesor detalleProfesor) {
		this.detalleProfesor = detalleProfesor;
	}
	
	public DetalleProfesor getDetalleProfesor() {
		return this.detalleProfesor;
	}

	public void setDetalleProfesor(DetalleProfesor detalleProfesor) {
		this.detalleProfesor = detalleProfesor;
	}

	public List<Curso> getListaCursos() {
		return this.listaCursos;
	}

	public void setListaCursos(List<Curso> listaCursos) {
		this.listaCursos = listaCursos;
	}

	@Override
	public String toString() {
		return "Profesor [id=" + this.id + ", nombre=" + this.nombre + ", apellido=" + this.apellido + ", email=" + this.email + "]";
	}

}
