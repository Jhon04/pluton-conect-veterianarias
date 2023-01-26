package com.pluton.veterianaria.domain;

public class CalendarioServicioPojo {

	private int idCalendarioServicio;

	private int idEstado;

	private String mesIni;

	private String mesFin;

	private String semanaIni;

	private String semanaFin;

	private String diaIni;

	private String diaFin;

	private String horaIni;

	private String horaFin;

	private String diasSemanaNoLaborableIni;

	private String diasSemanaNoLaborableFin;


	public CalendarioServicioPojo() { }
	public int getIdCalendarioServicio(){ return idCalendarioServicio; }

	public void setIdCalendarioServicio(int idCalendarioServicio){this.idCalendarioServicio = idCalendarioServicio;}

	public int getIdEstado(){ return idEstado; }

	public void setIdEstado(int idEstado){this.idEstado = idEstado;}

	public String getMesIni(){ return mesIni; }

	public void setMesIni(String mesIni){this.mesIni = mesIni;}

	public String getMesFin(){ return mesFin; }

	public void setMesFin(String mesFin){this.mesFin = mesFin;}

	public String getSemanaIni(){ return semanaIni; }

	public void setSemanaIni(String semanaIni){this.semanaIni = semanaIni;}

	public String getSemanaFin(){ return semanaFin; }

	public void setSemanaFin(String semanaFin){this.semanaFin = semanaFin;}

	public String getDiaIni(){ return diaIni; }

	public void setDiaIni(String diaIni){this.diaIni = diaIni;}

	public String getDiaFin(){ return diaFin; }

	public void setDiaFin(String diaFin){this.diaFin = diaFin;}

	public String getHoraIni(){ return horaIni; }

	public void setHoraIni(String horaIni){this.horaIni = horaIni;}

	public String getHoraFin(){ return horaFin; }

	public void setHoraFin(String horaFin){this.horaFin = horaFin;}

	public String getDiasSemanaNoLaborableIni(){ return diasSemanaNoLaborableIni; }

	public void setDiasSemanaNoLaborableIni(String diasSemanaNoLaborableIni){this.diasSemanaNoLaborableIni = diasSemanaNoLaborableIni;}

	public String getDiasSemanaNoLaborableFin(){ return diasSemanaNoLaborableFin; }

	public void setDiasSemanaNoLaborableFin(String diasSemanaNoLaborableFin){this.diasSemanaNoLaborableFin = diasSemanaNoLaborableFin;}

}