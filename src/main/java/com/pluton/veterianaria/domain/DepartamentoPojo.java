package com.pluton.veterianaria.domain;

public class DepartamentoPojo {

	private int idDepartamento;

	private int idEstado;

	private String nombreDep;


	public DepartamentoPojo() { }
	public int getIdDepartamento(){ return idDepartamento; }

	public void setIdDepartamento(int idDepartamento){this.idDepartamento = idDepartamento;}

	public int getIdEstado(){ return idEstado; }

	public void setIdEstado(int idEstado){this.idEstado = idEstado;}

	public String getNombreDep(){ return nombreDep; }

	public void setNombreDep(String nombreDep){this.nombreDep = nombreDep;}

}