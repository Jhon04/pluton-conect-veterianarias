package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    /*
    * @Temporal(TemporalType.TIMESTAMP)
	* @Column(name = "fecha_creacion")
	* private Date fechaCreacion;
    * */

    private static final long serialVersionUID = 8799656478674716638L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer idCliente;

    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "id_distrito")
    private Integer idDistrito;
    private String email;
    private String nombre;
    private String apellido;
    private String celular;
    private String imgBack;
    private String img;
    private String direccion;
    private String ubicacion;
    private boolean estado;
    private String fechMod;
    private String userMod;

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

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getFechMod() {
        return fechMod;
    }

    public void setFechMod(String fechMod) {
        this.fechMod = fechMod;
    }

    public String getUserMod() {
        return userMod;
    }

    public void setUserMod(String userMod) {
        this.userMod = userMod;
    }
}
