package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="det_empresa_comentario")
public class DetEmpresaComentario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_det_empresa_comentario")
	private Integer idDetEmpresaComentario;

	@Column(name = "id_empresa")
	private Integer idEmpresa;

	@Column(name = "id_comentario")
	private Integer idComentario;

	@Column(name = "id_estado")
	private Integer idEstado;


	@ManyToOne
	@JoinColumn(name = "id_empresa", insertable = false, updatable = false)
	private Empresa empresa;

	@ManyToOne
	@JoinColumn(name = "id_comentario", insertable = false, updatable = false)
	private Comentario comentario;

	@ManyToOne
	@JoinColumn(name = "id_estado", insertable = false, updatable = false)
	private Estado estado;

	public DetEmpresaComentario() {}
	public Integer getIdDetEmpresaComentario(){ return idDetEmpresaComentario; }

	public void setIdDetEmpresaComentario(Integer idDetEmpresaComentario){this.idDetEmpresaComentario = idDetEmpresaComentario;}

	public Integer getIdEmpresa(){ return idEmpresa; }

	public void setIdEmpresa(Integer idEmpresa){this.idEmpresa = idEmpresa;}

	public Integer getIdComentario(){ return idComentario; }

	public void setIdComentario(Integer idComentario){this.idComentario = idComentario;}

	public Integer getIdEstado(){ return idEstado; }

	public void setIdEstado(Integer idEstado){this.idEstado = idEstado;}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Comentario getComentario() {
		return comentario;
	}

	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}