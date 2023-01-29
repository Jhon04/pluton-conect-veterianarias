package com.pluton.veterianaria.domain;

import java.util.Date;
public class CitaReservaAtencionPojo {

	private int idCitaReservaAtencion;

	private int idCliente;

	private int idEstado;

	private Date fechaCit;

	private Date horaIniCit;

	private Date horaFinCit;


	public CitaReservaAtencionPojo() { }
	public int getIdCitaReservaAtencion(){ return idCitaReservaAtencion; }

	public void setIdCitaReservaAtencion(int idCitaReservaAtencion){this.idCitaReservaAtencion = idCitaReservaAtencion;}

	public int getIdCliente(){ return idCliente; }

	public void setIdCliente(int idCliente){this.idCliente = idCliente;}

	public int getIdEstado(){ return idEstado; }

	public void setIdEstado(int idEstado){this.idEstado = idEstado;}

	public Date getFechaCit(){ return fechaCit; }

	public void setFechaCit(Date fechaCit){this.fechaCit = fechaCit;}

	public Date getHoraIniCit(){ return horaIniCit; }

	public void setHoraIniCit(Date horaIniCit){this.horaIniCit = horaIniCit;}

	public Date getHoraFinCit(){ return horaFinCit; }

	public void setHoraFinCit(Date horaFinCit){this.horaFinCit = horaFinCit;}

}