package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "distrito")
public class Distrito implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_distrito")
    private Integer idDistrito;

    @Column(name = "id_provincia")
    private Integer idProvincia;

    @Column(name = "nombre_distrito")
    private String nombreDistrito;

    // (Many) Una *Provincia puede tener muchos *Distrito
    // (One) Un *Distrito solo puede pertenecer a una sola *Provincia
    @ManyToOne
    @JoinColumn(name = "id_provincia", insertable = false, updatable = false)
    private Provincia provincia;

    public Distrito() {
    }

    public Integer getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(Integer idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }

    public Integer getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}
