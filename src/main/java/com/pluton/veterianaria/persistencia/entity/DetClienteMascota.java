package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="det_cliente_mascota")
public class DetClienteMascota implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_det_cliente_mascota")
	private Integer idDetClienteMascota;

	@Column(name = "id_mascota")
	private Integer idMascota;

	@Column(name = "id_cliente")
	private Integer idCliente;


	@ManyToOne
	@JoinColumn(name = "id_mascota", insertable = false, updatable = false)
	private Mascota mascota;

	@ManyToOne
	@JoinColumn(name = "id_cliente", insertable = false, updatable = false)
	private Cliente cliente;

	public DetClienteMascota() {}
	public Integer getIdDetClienteMascota(){ return idDetClienteMascota; }

	public void setIdDetClienteMascota(Integer idDetClienteMascota){this.idDetClienteMascota = idDetClienteMascota;}

	public Integer getIdMascota(){ return idMascota; }

	public void setIdMascota(Integer idMascota){this.idMascota = idMascota;}

	public Integer getIdCliente(){ return idCliente; }

	public void setIdCliente(Integer idCliente){this.idCliente = idCliente;}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}