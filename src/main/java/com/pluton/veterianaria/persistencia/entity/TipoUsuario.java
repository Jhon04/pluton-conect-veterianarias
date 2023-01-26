package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="tipo_usuario")
public class TipoUsuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_usuario")
	private Integer idTipoUsuario;

	@Column(name = "id_estado")
	private Integer idEstado;

	@Column(name = "nombre_tip_usu")
	private String nombreTipUsu;


	// (Many) Un estado lo puede tener muchos clientes
	// (One) UnCliente solo puede tener un estado
	@ManyToOne
	@JoinColumn(name = "id_estado", insertable = false, updatable = false)
	private Estado estado;

	public TipoUsuario() {}
	public Integer getIdTipoUsuario(){ return idTipoUsuario; }

	public void setIdTipoUsuario(Integer idTipoUsuario){this.idTipoUsuario = idTipoUsuario;}

	public Integer getIdEstado(){ return idEstado; }

	public void setIdEstado(Integer idEstado){this.idEstado = idEstado;}

	public String getNombreTipUsu(){ return nombreTipUsu; }

	public void setNombreTipUsu(String nombreTipUsu){this.nombreTipUsu = nombreTipUsu;}

}