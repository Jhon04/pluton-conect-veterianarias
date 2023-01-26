package com.pluton.veterianaria.domain;

public class EstadoPojo {

	private int idEstado;

	private String descripcionEstado;


	public EstadoPojo() { }
	public int getIdEstado(){ return idEstado; }

	public void setIdEstado(int idEstado){this.idEstado = idEstado;}

	public String getDescripcionEstado(){ return descripcionEstado; }

	public void setDescripcionEstado(String descripcionEstado){this.descripcionEstado = descripcionEstado;}

}