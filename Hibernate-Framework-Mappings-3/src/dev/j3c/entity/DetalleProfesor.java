package dev.j3c.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="detalle_profesor")
public class DetalleProfesor {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="canal_youtube")
	private String canalYoutube;
	
	@Column(name="pasatiempo")
	private String pasatiempo;

	@OneToOne(mappedBy="detalleProfesor", cascade= {
			CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST,	//Tambien se pueden definir individualmente si es que solo queremos utilizar algunas
			CascadeType.REFRESH,
			CascadeType.REMOVE
	})
	private Profesor profesor;
	
	public DetalleProfesor() {
		
	}
	
	public DetalleProfesor(String canalYoutube, String pasatiempo) {
		this.canalYoutube = canalYoutube;
		this.pasatiempo = pasatiempo;
		this.profesor = null;
	}
	
	public DetalleProfesor(int id, String canalYoutube, String pasatiempo) {
		this.id = id;
		this.canalYoutube = canalYoutube;
		this.pasatiempo = pasatiempo;
		this.profesor = null;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCanalYoutube() {
		return this.canalYoutube;
	}

	public void setCanalYoutube(String canalYoutube) {
		this.canalYoutube = canalYoutube;
	}

	public String getPasatiempo() {
		return this.pasatiempo;
	}

	public void setPasatiempo(String pasatiempo) {
		this.pasatiempo = pasatiempo;
	}
	
	public Profesor getProfesor() {
		return this.profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	@Override
	public String toString() {
		return "DetalleProfesor [id=" + this.id + ", canalYoutube=" + this.canalYoutube + ", pasatiempo=" + this.pasatiempo + "]";
	}
}
