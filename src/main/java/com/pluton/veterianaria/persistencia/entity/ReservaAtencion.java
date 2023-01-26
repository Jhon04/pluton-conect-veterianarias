package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name ="reserva_atencion")
public class ReservaAtencion implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cita_reserva_atencion")
	private Integer idCitaReservaAtencion;

	@Column(name = "id_cliente")
	private Integer idCliente;

	@Column(name = "id_estado")
	private Integer idEstado;

	@Column(name = "fecha_cit")
	private Date fechaCit;

	@Column(name = "hora_ini_cit")
	private Date horaIniCit;

	@Column(name = "hora_fin_cit")
	private Date horaFinCit;


	//Use cualquiera de las relaciones @ManyToOne or @OneToMany or OneToOne
	@JoinColumn(name = "id_cliente", insertable = false, updatable = false)
	private Cliente cliente;

	// (Many) Un estado lo puede tener muchos clientes
	// (One) UnCliente solo puede tener un estado
	@ManyToOne
	@JoinColumn(name = "id_estado", insertable = false, updatable = false)
	private Estado estado;

	public ReservaAtencion() {}
	public Integer getIdCitaReservaAtencion(){ return idCitaReservaAtencion; }

	public void setIdCitaReservaAtencion(Integer idCitaReservaAtencion){this.idCitaReservaAtencion = idCitaReservaAtencion;}

	public Integer getIdCliente(){ return idCliente; }

	public void setIdCliente(Integer idCliente){this.idCliente = idCliente;}

	public Integer getIdEstado(){ return idEstado; }

	public void setIdEstado(Integer idEstado){this.idEstado = idEstado;}

	public Date getFechaCit(){ return fechaCit; }

	public void setFechaCit(Date fechaCit){this.fechaCit = fechaCit;}

	public Date getHoraIniCit(){ return horaIniCit; }

	public void setHoraIniCit(Date horaIniCit){this.horaIniCit = horaIniCit;}

	public Date getHoraFinCit(){ return horaFinCit; }

	public void setHoraFinCit(Date horaFinCit){this.horaFinCit = horaFinCit;}

}