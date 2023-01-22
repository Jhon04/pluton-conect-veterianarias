package com.pluton.veterianaria.domain;

import javax.persistence.Column;

public class RazaPojo {
    private int idRaza;
    private String nomRaza;

    public int getIdRaza() {
        return idRaza;
    }

    public void setIdRaza(int idRaza) {
        this.idRaza = idRaza;
    }

    public String getNomRaza() {
        return nomRaza;
    }

    public void setNomRaza(String nomRaza) {
        this.nomRaza = nomRaza;
    }
}
