package com.pluton.veterianaria.domain;

public class DetClienteMascotaPojo {

	private int idDetClienteMascota;

	private int idMascota;

	private int idCliente;


	public DetClienteMascotaPojo() { }
	public int getIdDetClienteMascota(){ return idDetClienteMascota; }

	public void setIdDetClienteMascota(int idDetClienteMascota){this.idDetClienteMascota = idDetClienteMascota;}

	public int getIdMascota(){ return idMascota; }

	public void setIdMascota(int idMascota){this.idMascota = idMascota;}

	public int getIdCliente(){ return idCliente; }

	public void setIdCliente(int idCliente){this.idCliente = idCliente;}

}