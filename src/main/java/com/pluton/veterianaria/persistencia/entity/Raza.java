package com.pluton.veterianaria.persistencia.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "raza")
public class Raza implements Serializable {

    private static final  long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_raza")
    private Integer idRaza;

    @Column(name = "nombre_raz")
    private String nomRaza;

    public Raza() {
    }

    public Integer getIdRaza() {
        return idRaza;
    }

    public void setIdRaza(Integer idRaza) {
        this.idRaza = idRaza;
    }

    public String getNomRaza() {
        return nomRaza;
    }

    public void setNomRaza(String nomRaza) {
        this.nomRaza = nomRaza;
    }
}
