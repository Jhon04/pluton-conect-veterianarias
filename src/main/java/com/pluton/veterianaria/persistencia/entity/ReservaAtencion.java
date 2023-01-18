package com.pluton.veterianaria.persistencia.entity;

import java.io.Serializable;
import java.util.Date;

public class ReservaAtencion implements Serializable {

    private static final long serialVersionUID = 8799656478674716638L;

    private int IdReservaAtencion;
    private int idCliente;
    private Date fecha;
    private Date horaIni;
    private Date horaFin;
    private boolean estado;

    public ReservaAtencion() {
    }

    public int getIdReservaAtencion() {
        return IdReservaAtencion;
    }

    public void setIdReservaAtencion(int idReservaAtencion) {
        IdReservaAtencion = idReservaAtencion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(Date horaIni) {
        this.horaIni = horaIni;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
