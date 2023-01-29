package com.pluton.veterianaria.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.pluton.veterianaria.utils.CustomJsonDateDeserializer;
import com.pluton.veterianaria.utils.CustomJsonDateSerializer;

import java.util.Date;
public class ComentarioPojo {

	private int idComentario;

	private int idCliente;

	private int idEstado;

	private String tituloCom;

	private String comentario;

	private Date fechaCom;

	private String calificacionCom;


	public ComentarioPojo() { }
	public int getIdComentario(){ return idComentario; }

	public void setIdComentario(int idComentario){this.idComentario = idComentario;}

	public int getIdCliente(){ return idCliente; }

	public void setIdCliente(int idCliente){this.idCliente = idCliente;}

	public int getIdEstado(){ return idEstado; }

	public void setIdEstado(int idEstado){this.idEstado = idEstado;}

	public String getTituloCom(){ return tituloCom; }

	public void setTituloCom(String tituloCom){this.tituloCom = tituloCom;}

	public String getComentario(){ return comentario; }

	public void setComentario(String comentario){this.comentario = comentario;}
	@JsonSerialize(using = CustomJsonDateSerializer.class)
	public Date getFechaCom(){ return fechaCom; }
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	public void setFechaCom(Date fechaCom){this.fechaCom = fechaCom;}

	public String getCalificacionCom(){ return calificacionCom; }

	public void setCalificacionCom(String calificacionCom){this.calificacionCom = calificacionCom;}

}