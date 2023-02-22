package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="mascota")
public class Mascota implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_mascota")
	private Integer idMascota;

	@Column(name = "id_raza")
	private Integer idRaza;

	@Column(name = "id_estado")
	private Integer idEstado;

	@Column(name = "nombre_mas")
	private String nombreMas;

	@Column(name = "edad_mas")
	private Integer edadMas;

	@Column(name = "peso_mas")
	private Double pesoMas;

	@Column(name = "size_mas")
	private Double sizeMas;

	@ManyToOne
	@JoinColumn(name = "id_raza", insertable = false, updatable = false)
	private Raza raza;

	@ManyToOne
	@JoinColumn(name = "id_estado", insertable = false, updatable = false)
	private Estado estado;

	public Mascota() {}
	public Integer getIdMascota(){ return idMascota; }

	public void setIdMascota(Integer idMascota){this.idMascota = idMascota;}

	public Integer getIdRaza() {
		return idRaza;
	}

	public void setIdRaza(Integer idRaza) {
		this.idRaza = idRaza;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public Integer getIdEstado(){ return idEstado; }

	public void setIdEstado(Integer idEstado){this.idEstado = idEstado;}

	public String getNombreMas(){ return nombreMas; }

	public void setNombreMas(String nombreMas){this.nombreMas = nombreMas;}

	public Integer getEdadMas(){ return edadMas; }

	public void setEdadMas(Integer edadMas){this.edadMas = edadMas;}

	public Double getPesoMas() {
		return pesoMas;
	}

	public void setPesoMas(Double pesoMas) {
		this.pesoMas = pesoMas;
	}

	public Double getSizeMas() {
		return sizeMas;
	}

	public void setSizeMas(Double sizeMas) {
		this.sizeMas = sizeMas;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}