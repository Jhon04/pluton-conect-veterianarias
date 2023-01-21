package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;

@Entity
@Table(name = "tipo_usuario")
public class TipoUsuario {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_usu")
    private Integer idTipoUsuario;

    @Column(name = "nombre_tipo_usu")
    private String nombreTipoUsu;

    public TipoUsuario() {
    }

    public Integer getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(Integer idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getNombreTipoUsu() {
        return nombreTipoUsu;
    }

    public void setNombreTipoUsu(String nombreTipoUsu) {
        this.nombreTipoUsu = nombreTipoUsu;
    }
}
