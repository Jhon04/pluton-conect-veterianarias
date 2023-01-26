package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="distrito")
public class Distrito implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_distrito")
	private Integer idDistrito;

	@Column(name = "id_provincia")
	private Integer idProvincia;

	@Column(name = "id_estado")
	private Integer idEstado;

	@Column(name = "nombre_dis")
	private String nombreDis;


	// (Many) Una *Provincia puede tener muchos *Distrito
	// (One) Un *Distrito solo puede pertenecer a una sola *Provincia
	@ManyToOne
	@JoinColumn(name = "id_provincia", insertable = false, updatable = false)
	private Provincia provincia;

	// (Many) Un estado lo puede tener muchos clientes
	// (One) UnCliente solo puede tener un estado
	@ManyToOne
	@JoinColumn(name = "id_estado", insertable = false, updatable = false)
	private Estado estado;

	public Distrito() {}
	public Integer getIdDistrito(){ return idDistrito; }

	public void setIdDistrito(Integer idDistrito){this.idDistrito = idDistrito;}

	public Integer getIdProvincia(){ return idProvincia; }

	public void setIdProvincia(Integer idProvincia){this.idProvincia = idProvincia;}

	public Integer getIdEstado(){ return idEstado; }

	public void setIdEstado(Integer idEstado){this.idEstado = idEstado;}

	public String getNombreDis(){ return nombreDis; }

	public void setNombreDis(String nombreDis){this.nombreDis = nombreDis;}

}