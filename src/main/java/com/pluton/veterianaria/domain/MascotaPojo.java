package com.pluton.veterianaria.domain;

public class MascotaPojo {

	private int idMascota;

	private int idTipoMascota;

	private int idEstado;

	private int nombreMas;


	public MascotaPojo() { }
	public int getIdMascota(){ return idMascota; }

	public void setIdMascota(int idMascota){this.idMascota = idMascota;}

	public int getIdTipoMascota(){ return idTipoMascota; }

	public void setIdTipoMascota(int idTipoMascota){this.idTipoMascota = idTipoMascota;}

	public int getIdEstado(){ return idEstado; }

	public void setIdEstado(int idEstado){this.idEstado = idEstado;}

	public int getNombreMas(){ return nombreMas; }

	public void setNombreMas(int nombreMas){this.nombreMas = nombreMas;}

}