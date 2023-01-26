package com.pluton.veterianaria.domain;

public class RazaPojo {

	private int idRaza;

	private String nombreRaz;

	private int idEstado;


	public RazaPojo() { }
	public int getIdRaza(){ return idRaza; }

	public void setIdRaza(int idRaza){this.idRaza = idRaza;}

	public String getNombreRaz(){ return nombreRaz; }

	public void setNombreRaz(String nombreRaz){this.nombreRaz = nombreRaz;}

	public int getIdEstado(){ return idEstado; }

	public void setIdEstado(int idEstado){this.idEstado = idEstado;}

}