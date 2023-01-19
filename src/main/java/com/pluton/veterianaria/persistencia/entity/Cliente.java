package com.pluton.veterianaria.persistencia.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.pluton.veterianaria.utils.CustomJsonDateDeserializer;
import com.pluton.veterianaria.utils.CustomJsonDateSerializer;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer idCliente;

    // (One) Un *Usuario solo lo puede tener un *Cliente
    // (One) Un *Cliente solo puede tener un *Usuario
    @OneToOne
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private Usuario usuario;

    @Column(name = "id_distrito")
    private Integer idDistrito;

    @Column(name = "email_cli")
    private String email;

    @Column(name = "nombre_cli")
    private String nombre;

    @Column(name = "apellido_cli")
    private String apellido;

    @Column(name = "celular_cli")
    private String celular;

    @Column(name = "img_back_cli")
    private String imgBack;

    @Column(name = "img_back_cli")
    private String img;

    @Column(name = "direccion_cli")
    private String direccion;

    @Column(name = "ubicacion_cli")
    private String ubicacion;

    @Column(name = "estado_cli")
    private boolean estado;

    @Column(name = "fecha_mod_cli")
    private Date fechMod;

    @Column(name = "user_mod")
    private String userMod;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(Integer idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getImgBack() {
        return imgBack;
    }

    public void setImgBack(String imgBack) {
        this.imgBack = imgBack;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @JsonSerialize(using = CustomJsonDateSerializer.class)
    public Date getFechMod() {
        return fechMod;
    }

    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    public void setFechMod(Date fechMod) {
        this.fechMod = fechMod;
    }

    public String getUserMod() {
        return userMod;
    }

    public void setUserMod(String userMod) {
        this.userMod = userMod;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
