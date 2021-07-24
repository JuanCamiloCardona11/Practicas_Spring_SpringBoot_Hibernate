package dev.j3c.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="revision_curso")
public class RevisionCurso {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="comentario")
	private String comentario;
	
	public RevisionCurso() {
	}
	
	public RevisionCurso(String comentario) {
		this.comentario = comentario;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "RevisionCurso [id=" + this.id + ", comentario=" + this.comentario + "]";
	}
}
