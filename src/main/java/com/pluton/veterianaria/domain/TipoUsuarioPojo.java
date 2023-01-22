package com.pluton.veterianaria.domain;

public class TipoUsuarioPojo {

    private int idTipoUsuario;
    private String nombreTipoUsu;
    private boolean estado;

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getNombreTipoUsu() {
        return nombreTipoUsu;
    }

    public void setNombreTipoUsu(String nombreTipoUsu) {
        this.nombreTipoUsu = nombreTipoUsu;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
