package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="tipo_mascota")
public class TipoMascota implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_mascota")
	private Integer idTipoMascota;

	//@Column(name = "id_raza")
	//private Integer idRaza;

	@Column(name = "id_estado")
	private Integer idEstado;

	@Column(name = "nombre_tip_mas")
	private String nombreTipMas;


	// (Many) Un Tipo de Mascota puede tener varias Razas
	// (One) Una Raza puede estar
	/*@ManyToOne
	@JoinColumn(name = "id_raza", insertable = false, updatable = false)
	private Raza raza;*/

	// (Many) Un estado lo puede tener muchos Tipos De Mascota
	// (One) UnCliente solo puede tener un estado
	@ManyToOne
	@JoinColumn(name = "id_estado", insertable = false, updatable = false)
	private Estado estado;

	public TipoMascota() {}
	public Integer getIdTipoMascota(){ return idTipoMascota; }

	public void setIdTipoMascota(Integer idTipoMascota){this.idTipoMascota = idTipoMascota;}

	public Integer getIdEstado(){ return idEstado; }

	public void setIdEstado(Integer idEstado){this.idEstado = idEstado;}

	public String getNombreTipMas(){ return nombreTipMas; }

	public void setNombreTipMas(String nombreTipMas){this.nombreTipMas = nombreTipMas;}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}