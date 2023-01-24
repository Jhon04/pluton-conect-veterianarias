package com.pluton.veterianaria.domain;

public class ProvinciaPojo {

	private int idProvincia;

	private int idDepartamento;

	private String nombrePro;


	public ProvinciaPojo() { }
	public int getIdProvincia(){ return idProvincia; }

	public void setIdProvincia(int idProvincia){this.idProvincia = idProvincia;}

	public int getIdDepartamento(){ return idDepartamento; }

	public void setIdDepartamento(int idDepartamento){this.idDepartamento = idDepartamento;}

	public String getNombrePro(){ return nombrePro; }

	public void setNombrePro(String nombrePro){this.nombrePro = nombrePro;}

}