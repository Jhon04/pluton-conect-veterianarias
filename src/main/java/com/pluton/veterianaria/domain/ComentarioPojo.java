package com.pluton.veterianaria.domain;

import com.pluton.veterianaria.persistencia.entity.Cliente;

import javax.persistence.*;
import java.util.Date;

public class ComentarioPojo {

    private Integer idComentario;
    private Integer idCliente;
    private String tituloCom;
    private String comentario;
    private Date fechaCom;
    private String calificacionCom;
    private Boolean estado;
    private Cliente cliente;

    public Integer getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Integer idComentario) {
        this.idComentario = idComentario;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getTituloCom() {
        return tituloCom;
    }

    public void setTituloCom(String tituloCom) {
        this.tituloCom = tituloCom;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaCom() {
        return fechaCom;
    }

    public void setFechaCom(Date fechaCom) {
        this.fechaCom = fechaCom;
    }

    public String getCalificacionCom() {
        return calificacionCom;
    }

    public void setCalificacionCom(String calificacionCom) {
        this.calificacionCom = calificacionCom;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
