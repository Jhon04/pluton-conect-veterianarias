package com.pluton.veterianaria.domain;

public class MascotaPojo {

	private int idMascota;

	private int idTipoMascota;

	private int nombreMas;

	private boolean edadMas;


	public MascotaPojo() { }
	public int getIdMascota(){ return idMascota; }

	public void setIdMascota(int idMascota){this.idMascota = idMascota;}

	public int getIdTipoMascota(){ return idTipoMascota; }

	public void setIdTipoMascota(int idTipoMascota){this.idTipoMascota = idTipoMascota;}

	public int getNombreMas(){ return nombreMas; }

	public void setNombreMas(int nombreMas){this.nombreMas = nombreMas;}

	public boolean getEdadMas(){ return edadMas; }

	public void setEdadMas(boolean edadMas){this.edadMas = edadMas;}

}