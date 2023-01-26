package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="tipo_servicio")
public class TipoServicio implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_servicio")
	private Integer idTipoServicio;

	@Column(name = "id_estado")
	private Integer idEstado;

	@Column(name = "nombre_tip_serv")
	private String nombreTipServ;


	// (Many) Un estado lo puede tener muchos clientes
	// (One) UnCliente solo puede tener un estado
	@ManyToOne
	@JoinColumn(name = "id_estado", insertable = false, updatable = false)
	private Estado estado;

	public TipoServicio() {}
	public Integer getIdTipoServicio(){ return idTipoServicio; }

	public void setIdTipoServicio(Integer idTipoServicio){this.idTipoServicio = idTipoServicio;}

	public Integer getIdEstado(){ return idEstado; }

	public void setIdEstado(Integer idEstado){this.idEstado = idEstado;}

	public String getNombreTipServ(){ return nombreTipServ; }

	public void setNombreTipServ(String nombreTipServ){this.nombreTipServ = nombreTipServ;}

}