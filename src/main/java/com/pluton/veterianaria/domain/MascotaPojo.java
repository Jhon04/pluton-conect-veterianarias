package com.pluton.veterianaria.domain;

import javax.persistence.Column;

public class MascotaPojo {

	private int idMascota;

	private int idRaza;

	private int idEstado;

	private String nombreMas;

	private int edadMas;

	private double pesoMas;

	private double sizeMas;

	public MascotaPojo() { }
	public int getIdMascota(){ return idMascota; }

	public void setIdMascota(int idMascota){this.idMascota = idMascota;}

	public int getIdRaza() {
		return idRaza;
	}

	public void setIdRaza(int idRaza) {
		this.idRaza = idRaza;
	}

	public int getIdEstado(){ return idEstado; }

	public void setIdEstado(int idEstado){this.idEstado = idEstado;}

	public String getNombreMas(){ return nombreMas; }

	public void setNombreMas(String nombreMas){this.nombreMas = nombreMas;}

	public int getEdadMas(){ return edadMas; }

	public void setEdadMas(int edadMas){this.edadMas = edadMas;}

	public double getPesoMas() {
		return pesoMas;
	}

	public void setPesoMas(double pesoMas) {
		this.pesoMas = pesoMas;
	}

	public double getSizeMas() {
		return sizeMas;
	}

	public void setSizeMas(double sizeMas) {
		this.sizeMas = sizeMas;
	}
}