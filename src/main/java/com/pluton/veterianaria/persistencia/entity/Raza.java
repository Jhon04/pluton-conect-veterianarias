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

	@Column(name = "id_tipo_mascota")
	private Integer idTipoMascota;

	@Column(name = "id_estado")
	private Integer idEstado;

	@Column(name = "nombre_raz")
	private String nombreRaz;


	// (Many) Un estado lo puede tener muchos clientes
	// (One) UnCliente solo puede tener un estado
	@ManyToOne
	@JoinColumn(name = "id_estado", insertable = false, updatable = false)
	private Estado estado;

	@ManyToOne
	@JoinColumn(name = "id_tipo_mascota", insertable = false, updatable = false)
	private TipoMascota tipo_mascota;

	public Raza() {}
	public Integer getIdRaza(){ return idRaza; }

	public void setIdRaza(Integer idRaza){this.idRaza = idRaza;}

	public Integer getIdEstado(){ return idEstado; }

	public void setIdEstado(Integer idEstado){this.idEstado = idEstado;}

	public String getNombreRaz(){ return nombreRaz; }

	public void setNombreRaz(String nombreRaz){this.nombreRaz = nombreRaz;}

	public Integer getIdTipoMascota() {
		return idTipoMascota;
	}

	public void setIdTipoMascota(Integer idTipoMascota) {
		this.idTipoMascota = idTipoMascota;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public TipoMascota getTipo_mascota() {
		return tipo_mascota;
	}

	public void setTipo_mascota(TipoMascota tipo_mascota) {
		this.tipo_mascota = tipo_mascota;
	}
}