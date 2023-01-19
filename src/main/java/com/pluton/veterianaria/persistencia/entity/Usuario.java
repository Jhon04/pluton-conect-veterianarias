package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    private static final long serialVersionUID = 8799656478674716638L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    // (Many) Un *Tipo_de_usuario puede tener multiples usuario
    // (One) Un *Usuario solo puede tener un tipo de usuario
    @ManyToOne
    @JoinColumn(name = "id_tipo_usuario", insertable = false, updatable = false)
    private TipoUsuario tipoUsuario;

    @Column(name = "email_usu")
    private String emailUsu;

    @Column(name = "password_usu")
    private String password_usu;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getPassword_usu() {
        return password_usu;
    }

    public void setPassword_usu(String password_usu) {
        this.password_usu = password_usu;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
