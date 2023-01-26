package com.pluton.veterianaria.domain;

public class ServicioPojo {

	private int idServicio;

	private int idEmpresa;

	private int idTipoServicio;

	private int idCalendarioServicio;

	private int idEstado;

	private String nombreSer;

	private String descripcionSer;

	private String iconSer;

	private String duracionSer;


	public ServicioPojo() { }
	public int getIdServicio(){ return idServicio; }

	public void setIdServicio(int idServicio){this.idServicio = idServicio;}

	public int getIdEmpresa(){ return idEmpresa; }

	public void setIdEmpresa(int idEmpresa){this.idEmpresa = idEmpresa;}

	public int getIdTipoServicio(){ return idTipoServicio; }

	public void setIdTipoServicio(int idTipoServicio){this.idTipoServicio = idTipoServicio;}

	public int getIdCalendarioServicio(){ return idCalendarioServicio; }

	public void setIdCalendarioServicio(int idCalendarioServicio){this.idCalendarioServicio = idCalendarioServicio;}

	public int getIdEstado(){ return idEstado; }

	public void setIdEstado(int idEstado){this.idEstado = idEstado;}

	public String getNombreSer(){ return nombreSer; }

	public void setNombreSer(String nombreSer){this.nombreSer = nombreSer;}

	public String getDescripcionSer(){ return descripcionSer; }

	public void setDescripcionSer(String descripcionSer){this.descripcionSer = descripcionSer;}

	public String getIconSer(){ return iconSer; }

	public void setIconSer(String iconSer){this.iconSer = iconSer;}

	public String getDuracionSer(){ return duracionSer; }

	public void setDuracionSer(String duracionSer){this.duracionSer = duracionSer;}

}