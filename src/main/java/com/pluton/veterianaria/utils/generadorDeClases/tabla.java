package com.pluton.veterianaria.utils.generadorDeClases;

import java.util.List;

public class tabla {
    private String nombreTabla;
    private String nombreClase;
    private List<ColumnaTabla> columnas;

    public tabla() {
    }

    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    public List<ColumnaTabla> getColumnas() {
        return columnas;
    }

    public void setColumnas(List<ColumnaTabla> columnas) {
        this.columnas = columnas;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }
}
