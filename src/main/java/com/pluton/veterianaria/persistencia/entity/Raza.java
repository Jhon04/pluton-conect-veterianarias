package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="raza")
public class Raza implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_raza")
	private Integer idRaza;

	@Column(name = "id_estado")
	private Integer idEstado;

	@Column(name = "nombre_raz")
	private String nombreRaz;


	// (Many) Un estado lo puede tener muchos clientes
	// (One) UnCliente solo puede tener un estado
	@ManyToOne
	@JoinColumn(name = "id_estado", insertable = false, updatable = false)
	private Estado estado;

	public Raza() {}
	public Integer getIdRaza(){ return idRaza; }

	public void setIdRaza(Integer idRaza){this.idRaza = idRaza;}

	public Integer getIdEstado(){ return idEstado; }

	public void setIdEstado(Integer idEstado){this.idEstado = idEstado;}

	public String getNombreRaz(){ return nombreRaz; }

	public void setNombreRaz(String nombreRaz){this.nombreRaz = nombreRaz;}

}