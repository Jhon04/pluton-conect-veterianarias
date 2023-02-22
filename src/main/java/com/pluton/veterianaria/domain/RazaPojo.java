package com.pluton.veterianaria.domain;

public class RazaPojo {

	private int idRaza;

	private int idEstado;

	private int idTipoMascota;

	private String nombreRaz;


	public RazaPojo() { }
	public int getIdRaza(){ return idRaza; }

	public void setIdRaza(int idRaza){this.idRaza = idRaza;}

	public int getIdEstado(){ return idEstado; }

	public void setIdEstado(int idEstado){this.idEstado = idEstado;}

	public String getNombreRaz(){ return nombreRaz; }

	public void setNombreRaz(String nombreRaz){this.nombreRaz = nombreRaz;}

	public int getIdTipoMascota() {
		return idTipoMascota;
	}

	public void setIdTipoMascota(int idTipoMascota) {
		this.idTipoMascota = idTipoMascota;
	}
}