package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="calendario_servicio")
public class CalendarioServicio implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_calendario_servicio")
	private Integer idCalendarioServicio;

	@Column(name = "id_estado")
	private Integer idEstado;

	@Column(name = "mes_ini")
	private String mesIni;

	@Column(name = "mes_fin")
	private String mesFin;

	@Column(name = "semana_ini")
	private String semanaIni;

	@Column(name = "semana_fin")
	private String semanaFin;

	@Column(name = "dia_ini")
	private String diaIni;

	@Column(name = "dia_fin")
	private String diaFin;

	@Column(name = "hora_ini")
	private String horaIni;

	@Column(name = "hora_fin")
	private String horaFin;

	@Column(name = "dias_semana_no_laborable_ini")
	private String diasSemanaNoLaborableIni;

	@Column(name = "dias_semana_no_laborable_fin")
	private String diasSemanaNoLaborableFin;


	// (Many) Un estado lo puede tener muchos clientes
	// (One) UnCliente solo puede tener un estado
	@ManyToOne
	@JoinColumn(name = "id_estado", insertable = false, updatable = false)
	private Estado estado;

	public CalendarioServicio() {}
	public Integer getIdCalendarioServicio(){ return idCalendarioServicio; }

	public void setIdCalendarioServicio(Integer idCalendarioServicio){this.idCalendarioServicio = idCalendarioServicio;}

	public Integer getIdEstado(){ return idEstado; }

	public void setIdEstado(Integer idEstado){this.idEstado = idEstado;}

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