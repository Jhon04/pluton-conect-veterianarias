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
	private Integer nombreMas;


	//Use cualquiera de las relaciones @ManyToOne or @OneToMany or OneToOne
	@JoinColumn(name = "id_tipo_mascota", insertable = false, updatable = false)
	private TipoMascota tipo_mascota;

	// (Many) Un estado lo puede tener muchos clientes
	// (One) UnCliente solo puede tener un estado
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

	public Integer getNombreMas(){ return nombreMas; }

	public void setNombreMas(Integer nombreMas){this.nombreMas = nombreMas;}

}