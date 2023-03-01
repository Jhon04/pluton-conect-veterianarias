package com.pluton.veterianaria.domain;

import javax.persistence.Column;
import java.util.Date;
public class ClientePojo {

	private int idCliente;

	private int idUsuario;

	private int idDistrito;

	private String direccionCli;

	private String nombreCli;

	private String apePaternoCli;

	private String apeMaternoCli;

	private String dniCli;

	private String ubicacionCli;

	private String emailCli;

	private String celularCli;

	private String imgCli;

	private String imgBackCli;

	private Date fechaMod;

	private int userMod;

	private int idEstado;


	public ClientePojo() { }
	public int getIdCliente(){ return idCliente; }

	public void setIdCliente(int idCliente){this.idCliente = idCliente;}

	public int getIdUsuario(){ return idUsuario; }

	public void setIdUsuario(int idUsuario){this.idUsuario = idUsuario;}

	public int getIdDistrito(){ return idDistrito; }

	public void setIdDistrito(int idDistrito){this.idDistrito = idDistrito;}

	public String getDireccionCli(){ return direccionCli; }

	public void setDireccionCli(String direccionCli){this.direccionCli = direccionCli;}

	public String getNombreCli(){ return nombreCli; }

	public void setNombreCli(String nombreCli){this.nombreCli = nombreCli;}

	public String getApePaternoCli(){ return apePaternoCli; }

	public void setApePaternoCli(String apePaternoCli){this.apePaternoCli = apePaternoCli;}

	public String getApeMaternoCli(){ return apeMaternoCli; }

	public void setApeMaternoCli(String apeMaternoCli){this.apeMaternoCli = apeMaternoCli;}

	public String getUbicacionCli(){ return ubicacionCli; }

	public void setUbicacionCli(String ubicacionCli){this.ubicacionCli = ubicacionCli;}

	public String getEmailCli(){ return emailCli; }

	public void setEmailCli(String emailCli){this.emailCli = emailCli;}

	public String getCelularCli(){ return celularCli; }

	public void setCelularCli(String celularCli){this.celularCli = celularCli;}

	public String getImgCli(){ return imgCli; }

	public void setImgCli(String imgCli){this.imgCli = imgCli;}

	public String getImgBackCli(){ return imgBackCli; }

	public void setImgBackCli(String imgBackCli){this.imgBackCli = imgBackCli;}

	public Date getFechaMod(){ return fechaMod; }

	public void setFechaMod(Date fechaMod){this.fechaMod = fechaMod;}

	public int getUserMod(){ return userMod; }

	public void setUserMod(int userMod){this.userMod = userMod;}

	public int getIdEstado(){ return idEstado; }

	public void setIdEstado(int idEstado){this.idEstado = idEstado;}

	public String getDniCli() {
		return dniCli;
	}

	public void setDniCli(String dniCli) {
		this.dniCli = dniCli;
	}
}