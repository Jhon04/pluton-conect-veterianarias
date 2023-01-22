package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.util.Date;

public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comentario")
    private Integer idComentario;
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Column(name = "titulo_com")
    private String tituloCom;
    @Column(name = "comentario")
    private String comentario;
    @Column(name = "fecha_com")
    private Date fechaCom;
    @Column(name = "calificacion_com")
    private String calificacionCom;
    @Column(name = "estado")
    private Boolean estado;

    // (Many) Un *Cliente puede tener muchos *Comentarios
    // (One) Un *Comentario solo le pertenece a un *Cliente
    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private Cliente cliente;

    public Comentario() {
    }

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
