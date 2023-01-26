package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="estado")
public class Estado implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estado")
	private Integer idEstado;

	@Column(name = "descripcion_estado")
	private String descripcionEstado;


	public Estado() {}
	public Integer getIdEstado(){ return idEstado; }

	public void setIdEstado(Integer idEstado){this.idEstado = idEstado;}

	public String getDescripcionEstado(){ return descripcionEstado; }

	public void setDescripcionEstado(String descripcionEstado){this.descripcionEstado = descripcionEstado;}

}