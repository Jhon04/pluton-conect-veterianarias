package com.pluton.veterianaria.domain;

public class TipoServicioPojo {

	private int idTipoServicio;

	private int idEstado;

	private String nombreTipServ;


	public TipoServicioPojo() { }
	public int getIdTipoServicio(){ return idTipoServicio; }

	public void setIdTipoServicio(int idTipoServicio){this.idTipoServicio = idTipoServicio;}

	public int getIdEstado(){ return idEstado; }

	public void setIdEstado(int idEstado){this.idEstado = idEstado;}

	public String getNombreTipServ(){ return nombreTipServ; }

	public void setNombreTipServ(String nombreTipServ){this.nombreTipServ = nombreTipServ;}

}