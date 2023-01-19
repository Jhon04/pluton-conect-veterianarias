package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;

@Entity
@Table(name = "distrito")
public class Distrito {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_distrito")
    private Integer idDistrito;

    // (Many) Una *Provincia puede tener muchos *Distrito
    // (One) Un *Distrito solo puede pertenecer a una sola *Provincia
    @ManyToOne
    @JoinColumn(name = "id_provincia", insertable = false, updatable = false)
    private Provincia Provincia;

    @Column(name = "nombre_distrito")
    private String nombreDistrito;

    public Integer getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(Integer idDistrito) {
        this.idDistrito = idDistrito;
    }

    public Provincia getProvincia() {
        return Provincia;
    }

    public void setProvincia(Provincia provincia) {
        Provincia = provincia;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }
}
