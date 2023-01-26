package com.pluton.veterianaria.domain;

public class UsuarioPojo {

	private int idUsuario;

	private int idTipoUsuario;

	private int idEstado;

	private String emailUsu;

	private String passwordUsu;


	public UsuarioPojo() { }
	public int getIdUsuario(){ return idUsuario; }

	public void setIdUsuario(int idUsuario){this.idUsuario = idUsuario;}

	public int getIdTipoUsuario(){ return idTipoUsuario; }

	public void setIdTipoUsuario(int idTipoUsuario){this.idTipoUsuario = idTipoUsuario;}

	public int getIdEstado(){ return idEstado; }

	public void setIdEstado(int idEstado){this.idEstado = idEstado;}

	public String getEmailUsu(){ return emailUsu; }

	public void setEmailUsu(String emailUsu){this.emailUsu = emailUsu;}

	public String getPasswordUsu(){ return passwordUsu; }

	public void setPasswordUsu(String passwordUsu){this.passwordUsu = passwordUsu;}

}