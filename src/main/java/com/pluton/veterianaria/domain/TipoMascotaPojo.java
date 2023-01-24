package com.pluton.veterianaria.domain;

public class TipoMascotaPojo {

	private int idTipoMascota;

	private int idRaza;

	private String nombreTipMas;

	private boolean estado;


	public TipoMascotaPojo() { }
	public int getIdTipoMascota(){ return idTipoMascota; }

	public void setIdTipoMascota(int idTipoMascota){this.idTipoMascota = idTipoMascota;}

	public int getIdRaza(){ return idRaza; }

	public void setIdRaza(int idRaza){this.idRaza = idRaza;}

	public String getNombreTipMas(){ return nombreTipMas; }

	public void setNombreTipMas(String nombreTipMas){this.nombreTipMas = nombreTipMas;}

	public boolean getEstado(){ return estado; }

	public void setEstado(boolean estado){this.estado = estado;}

}