package com.pluton.veterianaria.domain;

import java.util.Date;
public class HistorialClinicoPojo {

	private int idHistorialClinico;

	private int idMascota;

	private int idServicio;

	private int idEstado;

	private String observacionHistorial;

	private Date fechaAtencion;


	public HistorialClinicoPojo() { }
	public int getIdHistorialClinico(){ return idHistorialClinico; }

	public void setIdHistorialClinico(int idHistorialClinico){this.idHistorialClinico = idHistorialClinico;}

	public int getIdMascota(){ return idMascota; }

	public void setIdMascota(int idMascota){this.idMascota = idMascota;}

	public int getIdServicio(){ return idServicio; }

	public void setIdServicio(int idServicio){this.idServicio = idServicio;}

	public int getIdEstado(){ return idEstado; }

	public void setIdEstado(int idEstado){this.idEstado = idEstado;}

	public String getObservacionHistorial(){ return observacionHistorial; }

	public void setObservacionHistorial(String observacionHistorial){this.observacionHistorial = observacionHistorial;}

	public Date getFechaAtencion(){ return fechaAtencion; }

	public void setFechaAtencion(Date fechaAtencion){this.fechaAtencion = fechaAtencion;}

}