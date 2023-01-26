package com.pluton.veterianaria.domain;

public class DistritoPojo {

	private int idDistrito;

	private int idProvincia;

	private int idEstado;

	private String nombreDis;


	public DistritoPojo() { }
	public int getIdDistrito(){ return idDistrito; }

	public void setIdDistrito(int idDistrito){this.idDistrito = idDistrito;}

	public int getIdProvincia(){ return idProvincia; }

	public void setIdProvincia(int idProvincia){this.idProvincia = idProvincia;}

	public int getIdEstado(){ return idEstado; }

	public void setIdEstado(int idEstado){this.idEstado = idEstado;}

	public String getNombreDis(){ return nombreDis; }

	public void setNombreDis(String nombreDis){this.nombreDis = nombreDis;}

}