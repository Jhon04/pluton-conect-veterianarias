package com.pluton.veterianaria.domain;

public class DetReservaAtencionServicioPojo {

	private int idDetReservaServicio;

	private int idCitaReservaAtencion;

	private int idServicio;


	public DetReservaAtencionServicioPojo() { }
	public int getIdDetReservaServicio(){ return idDetReservaServicio; }

	public void setIdDetReservaServicio(int idDetReservaServicio){this.idDetReservaServicio = idDetReservaServicio;}

	public int getIdCitaReservaAtencion(){ return idCitaReservaAtencion; }

	public void setIdCitaReservaAtencion(int idCitaReservaAtencion){this.idCitaReservaAtencion = idCitaReservaAtencion;}

	public int getIdServicio(){ return idServicio; }

	public void setIdServicio(int idServicio){this.idServicio = idServicio;}

}