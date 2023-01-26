package com.pluton.veterianaria.domain;

import java.util.Date;
public class EmpresaPojo {

	private int idEmpresa;

	private int idUsuario;

	private int idDistrito;

	private int idEstado;

	private String nombreEmp;

	private String descripcionEmp;

	private String emailEmp;

	private String celularEmp;

	private String imgBackEmp;

	private String imgEmp;

	private String direccionEmp;

	private String ubicacionEmp;

	private boolean calificacionEmp;

	private Date verificacionEmp;

	private int fechaMod;


	public EmpresaPojo() { }
	public int getIdEmpresa(){ return idEmpresa; }

	public void setIdEmpresa(int idEmpresa){this.idEmpresa = idEmpresa;}

	public int getIdUsuario(){ return idUsuario; }

	public void setIdUsuario(int idUsuario){this.idUsuario = idUsuario;}

	public int getIdDistrito(){ return idDistrito; }

	public void setIdDistrito(int idDistrito){this.idDistrito = idDistrito;}

	public int getIdEstado(){ return idEstado; }

	public void setIdEstado(int idEstado){this.idEstado = idEstado;}

	public String getNombreEmp(){ return nombreEmp; }

	public void setNombreEmp(String nombreEmp){this.nombreEmp = nombreEmp;}

	public String getDescripcionEmp(){ return descripcionEmp; }

	public void setDescripcionEmp(String descripcionEmp){this.descripcionEmp = descripcionEmp;}

	public String getEmailEmp(){ return emailEmp; }

	public void setEmailEmp(String emailEmp){this.emailEmp = emailEmp;}

	public String getCelularEmp(){ return celularEmp; }

	public void setCelularEmp(String celularEmp){this.celularEmp = celularEmp;}

	public String getImgBackEmp(){ return imgBackEmp; }

	public void setImgBackEmp(String imgBackEmp){this.imgBackEmp = imgBackEmp;}

	public String getImgEmp(){ return imgEmp; }

	public void setImgEmp(String imgEmp){this.imgEmp = imgEmp;}

	public String getDireccionEmp(){ return direccionEmp; }

	public void setDireccionEmp(String direccionEmp){this.direccionEmp = direccionEmp;}

	public String getUbicacionEmp(){ return ubicacionEmp; }

	public void setUbicacionEmp(String ubicacionEmp){this.ubicacionEmp = ubicacionEmp;}

	public boolean getCalificacionEmp(){ return calificacionEmp; }

	public void setCalificacionEmp(boolean calificacionEmp){this.calificacionEmp = calificacionEmp;}

	public Date getVerificacionEmp(){ return verificacionEmp; }

	public void setVerificacionEmp(Date verificacionEmp){this.verificacionEmp = verificacionEmp;}

	public int getFechaMod(){ return fechaMod; }

	public void setFechaMod(int fechaMod){this.fechaMod = fechaMod;}

}