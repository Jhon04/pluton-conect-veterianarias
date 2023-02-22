package com.pluton.veterianaria.domain;

public class TipoMascotaPojo {

	private int idTipoMascota;

	private int idEstado;

	private String nombreTipMas;


	public TipoMascotaPojo() { }
	public int getIdTipoMascota(){ return idTipoMascota; }

	public void setIdTipoMascota(int idTipoMascota){this.idTipoMascota = idTipoMascota;}

	public int getIdEstado(){ return idEstado; }

	public void setIdEstado(int idEstado){this.idEstado = idEstado;}

	public String getNombreTipMas(){ return nombreTipMas; }

	public void setNombreTipMas(String nombreTipMas){this.nombreTipMas = nombreTipMas;}

}