package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="det_reserva_atencion_servicio")
public class DetReservaAtencionServicio implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_det_reserva_servicio")
	private Integer idDetReservaServicio;

	@Column(name = "id_cita_reserva_atencion")
	private Integer idCitaReservaAtencion;

	@Column(name = "id_servicio")
	private Integer idServicio;

	@ManyToOne
	@JoinColumn(name = "id_cita_reserva_atencion", insertable = false, updatable = false)
	private CitaReservaAtencion citaReservaAtencion;

	@ManyToOne
	@JoinColumn(name = "id_servicio", insertable = false, updatable = false)
	private Servicio servicio;

	public DetReservaAtencionServicio() {}
	public Integer getIdDetReservaServicio(){ return idDetReservaServicio; }

	public void setIdDetReservaServicio(Integer idDetReservaServicio){this.idDetReservaServicio = idDetReservaServicio;}

	public Integer getIdCitaReservaAtencion(){ return idCitaReservaAtencion; }

	public void setIdCitaReservaAtencion(Integer idCitaReservaAtencion){this.idCitaReservaAtencion = idCitaReservaAtencion;}

	public Integer getIdServicio(){ return idServicio; }

	public void setIdServicio(Integer idServicio){this.idServicio = idServicio;}

	public CitaReservaAtencion getCitaReservaAtencion() {
		return citaReservaAtencion;
	}

	public void setCitaReservaAtencion(CitaReservaAtencion citaReservaAtencion) {
		this.citaReservaAtencion = citaReservaAtencion;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
}