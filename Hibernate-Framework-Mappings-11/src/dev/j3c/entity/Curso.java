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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class Curso {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@ManyToOne(cascade={
			CascadeType.PERSIST,
			CascadeType.MERGE,
			CascadeType.DETACH,
			CascadeType.REFRESH
	})
	@JoinColumn(name="profesor_id")
	private Profesor profesor;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="curso_id")
	private List<RevisionCurso> listaRevisiones;
	
	public Curso() {
	}

	public Curso(String titulo, String descripcion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.profesor = null;
	}
	
	public Curso(int id, String titulo, String descripcion) {
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.profesor = null;
	}
	
	public void agregarRevisionCurso(RevisionCurso revisionCurso) {
		if(this.listaRevisiones == null) {
			this.listaRevisiones = new ArrayList<>();
		}
		this.listaRevisiones.add(revisionCurso);
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Profesor getProfesor() {
		return this.profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	public List<RevisionCurso> getListaRevisiones() {
		return this.listaRevisiones;
	}

	public void setListaRevisiones(List<RevisionCurso> listaRevisiones) {
		this.listaRevisiones = listaRevisiones;
	}

	@Override
	public String toString() {
		return "Curso [id=" + this.id + ", titulo=" + this.titulo + ", descripcion=" + this.descripcion + "]";
	}	
}
