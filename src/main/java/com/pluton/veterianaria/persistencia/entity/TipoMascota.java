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

	@Column(name = "id_raza")
	private Integer idRaza;

	@Column(name = "nombre_tip_mas")
	private String nombreTipMas;

	@Column(name = "estado")
	private Boolean estado;


	//Use cualquiera de las relaciones @ManyToOne or @OneToMany or OneToOne
	@JoinColumn(name = "id_raza", insertable = false, updatable = false)
	private Raza raza;

	public TipoMascota() {}
	public Integer getIdTipoMascota(){ return idTipoMascota; }

	public void setIdTipoMascota(Integer idTipoMascota){this.idTipoMascota = idTipoMascota;}

	public Integer getIdRaza(){ return idRaza; }

	public void setIdRaza(Integer idRaza){this.idRaza = idRaza;}

	public String getNombreTipMas(){ return nombreTipMas; }

	public void setNombreTipMas(String nombreTipMas){this.nombreTipMas = nombreTipMas;}

	public Boolean getEstado(){ return estado; }

	public void setEstado(Boolean estado){this.estado = estado;}

}