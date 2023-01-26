package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name ="historial_clinico")
public class HistorialClinico implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_historial_clinico")
	private Integer idHistorialClinico;

	@Column(name = "id_mascota")
	private Integer idMascota;

	@Column(name = "id_servicio")
	private Integer idServicio;

	@Column(name = "id_estado")
	private Integer idEstado;

	@Column(name = "observacion_historial")
	private String observacionHistorial;

	@Column(name = "fecha_atencion")
	private Date fechaAtencion;


	//Use cualquiera de las relaciones @ManyToOne or @OneToMany or OneToOne
	@JoinColumn(name = "id_mascota", insertable = false, updatable = false)
	private Mascota mascota;

	//Use cualquiera de las relaciones @ManyToOne or @OneToMany or OneToOne
	@JoinColumn(name = "id_servicio", insertable = false, updatable = false)
	private Servicio servicio;

	// (Many) Un estado lo puede tener muchos clientes
	// (One) UnCliente solo puede tener un estado
	@ManyToOne
	@JoinColumn(name = "id_estado", insertable = false, updatable = false)
	private Estado estado;

	public HistorialClinico() {}
	public Integer getIdHistorialClinico(){ return idHistorialClinico; }

	public void setIdHistorialClinico(Integer idHistorialClinico){this.idHistorialClinico = idHistorialClinico;}

	public Integer getIdMascota(){ return idMascota; }

	public void setIdMascota(Integer idMascota){this.idMascota = idMascota;}

	public Integer getIdServicio(){ return idServicio; }

	public void setIdServicio(Integer idServicio){this.idServicio = idServicio;}

	public Integer getIdEstado(){ return idEstado; }

	public void setIdEstado(Integer idEstado){this.idEstado = idEstado;}

	public String getObservacionHistorial(){ return observacionHistorial; }

	public void setObservacionHistorial(String observacionHistorial){this.observacionHistorial = observacionHistorial;}

	public Date getFechaAtencion(){ return fechaAtencion; }

	public void setFechaAtencion(Date fechaAtencion){this.fechaAtencion = fechaAtencion;}

}