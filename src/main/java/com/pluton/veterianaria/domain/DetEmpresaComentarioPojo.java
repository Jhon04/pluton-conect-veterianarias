package com.pluton.veterianaria.domain;

public class DetEmpresaComentarioPojo {

	private int idDetEmpresaComentario;

	private int idEmpresa;

	private int idComentario;

	private int idEstado;


	public DetEmpresaComentarioPojo() { }
	public int getIdDetEmpresaComentario(){ return idDetEmpresaComentario; }

	public void setIdDetEmpresaComentario(int idDetEmpresaComentario){this.idDetEmpresaComentario = idDetEmpresaComentario;}

	public int getIdEmpresa(){ return idEmpresa; }

	public void setIdEmpresa(int idEmpresa){this.idEmpresa = idEmpresa;}

	public int getIdComentario(){ return idComentario; }

	public void setIdComentario(int idComentario){this.idComentario = idComentario;}

	public int getIdEstado(){ return idEstado; }

	public void setIdEstado(int idEstado){this.idEstado = idEstado;}

}