package com.pluton.veterianaria.domain;

import java.util.Date;

public class ClientePojo {

    private int idCliente;
    private int idUsuario;
    private int idDistrito;
    private String email;
    private String nombre;
    private String apePaterno;
    private String apeMaterno;
    private String celular;
    private String imgBack;
    private String img;
    private String direccion;
    private String ubicacion;
    private boolean estado;
    private Date fechMod;
    private int userMod;
    private UsuarioPojo usuario;
    private DistrictPojo distrito;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
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

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
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

    public Date getFechMod() {
        return fechMod;
    }

    public void setFechMod(Date fechMod) {
        this.fechMod = fechMod;
    }

    public int getUserMod() {
        return userMod;
    }

    public void setUserMod(int userMod) {
        this.userMod = userMod;
    }

    public UsuarioPojo getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioPojo usuario) {
        this.usuario = usuario;
    }

    public DistrictPojo getDistrito() {
        return distrito;
    }

    public void setDistrito(DistrictPojo distrito) {
        this.distrito = distrito;
    }
}
