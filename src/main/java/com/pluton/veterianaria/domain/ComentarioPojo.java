package com.pluton.veterianaria.domain;

import java.util.Date;
public class ComentarioPojo {

	private int idComentario;

	private int idCliente;

	private int idEstado;

	private Date tituloCom;

	private String comentario;


	public ComentarioPojo() { }
	public int getIdComentario(){ return idComentario; }

	public void setIdComentario(int idComentario){this.idComentario = idComentario;}

	public int getIdCliente(){ return idCliente; }

	public void setIdCliente(int idCliente){this.idCliente = idCliente;}

	public int getIdEstado(){ return idEstado; }

	public void setIdEstado(int idEstado){this.idEstado = idEstado;}

	public Date getTituloCom(){ return tituloCom; }

	public void setTituloCom(Date tituloCom){this.tituloCom = tituloCom;}

	public String getComentario(){ return comentario; }

	public void setComentario(String comentario){this.comentario = comentario;}

}