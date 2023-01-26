package com.pluton.veterianaria.domain;

public class TipoUsuarioPojo {

	private int idTipoUsuario;

	private int idEstado;

	private String nombreTipUsu;


	public TipoUsuarioPojo() { }
	public int getIdTipoUsuario(){ return idTipoUsuario; }

	public void setIdTipoUsuario(int idTipoUsuario){this.idTipoUsuario = idTipoUsuario;}

	public int getIdEstado(){ return idEstado; }

	public void setIdEstado(int idEstado){this.idEstado = idEstado;}

	public String getNombreTipUsu(){ return nombreTipUsu; }

	public void setNombreTipUsu(String nombreTipUsu){this.nombreTipUsu = nombreTipUsu;}

}