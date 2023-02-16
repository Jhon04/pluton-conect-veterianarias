package com.pluton.veterianaria.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.pluton.veterianaria.utils.CustomJsonDateDeserializer;
import com.pluton.veterianaria.utils.CustomJsonDateSerializer;

import javax.persistence.Column;
import java.util.Date;
import java.util.List;

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

	private String calificacionEmp;

	private boolean verificacionEmp;

	private Date fechaMod;

	private int userMod;

	private String rucEmp;

	/*
	private List<ComentarioPojo> comentarios;
	 */

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

	public String getCalificacionEmp(){ return calificacionEmp; }

	public void setCalificacionEmp(String calificacionEmp){this.calificacionEmp = calificacionEmp;}

	public boolean getVerificacionEmp(){ return verificacionEmp; }

	public void setVerificacionEmp(boolean verificacionEmp){this.verificacionEmp = verificacionEmp;}
	@JsonSerialize(using = CustomJsonDateSerializer.class)
	public Date getFechaMod(){ return fechaMod; }
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	public void setFechaMod(Date fechaMod){this.fechaMod = fechaMod;}

	public int getUserMod(){ return userMod; }

	public void setUserMod(int userMod){this.userMod = userMod;}

	public boolean isVerificacionEmp() {
		return verificacionEmp;
	}

	/*
	public List<ComentarioPojo> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<ComentarioPojo> comentarios) {
		this.comentarios = comentarios;
	}
	 */

	public String getRucEmp() {
		return rucEmp;
	}

	public void setRucEmp(String rucEmp) {
		this.rucEmp = rucEmp;
	}
}