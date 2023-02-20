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

	@Column(name = "id_tipo_mascota")
	private Integer idTipoMascota;

	@Column(name = "id_estado")
	private Integer idEstado;

	@Column(name = "nombre_mas")
	private String nombreMas;

	@Column(name = "edad_mas")
	private Integer edadMas;


	@OneToOne
	@JoinColumn(name = "id_tipo_mascota", insertable = false, updatable = false)
	private TipoMascota tipo_mascota;

	@ManyToOne
	@JoinColumn(name = "id_estado", insertable = false, updatable = false)
	private Estado estado;

	public Mascota() {}
	public Integer getIdMascota(){ return idMascota; }

	public void setIdMascota(Integer idMascota){this.idMascota = idMascota;}

	public Integer getIdTipoMascota(){ return idTipoMascota; }

	public void setIdTipoMascota(Integer idTipoMascota){this.idTipoMascota = idTipoMascota;}

	public Integer getIdEstado(){ return idEstado; }

	public void setIdEstado(Integer idEstado){this.idEstado = idEstado;}

	public String getNombreMas(){ return nombreMas; }

	public void setNombreMas(String nombreMas){this.nombreMas = nombreMas;}

	public Integer getEdadMas(){ return edadMas; }

	public void setEdadMas(Integer edadMas){this.edadMas = edadMas;}

}