package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="servicio")
public class Servicio implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_servicio")
	private Integer idServicio;

	@Column(name = "id_empresa")
	private Integer idEmpresa;

	@Column(name = "id_tipo_servicio")
	private Integer idTipoServicio;

	@Column(name = "id_calendario_servicio")
	private Integer idCalendarioServicio;

	@Column(name = "id_estado")
	private Integer idEstado;

	@Column(name = "nombre_ser")
	private String nombreSer;

	@Column(name = "descripcion_ser")
	private String descripcionSer;

	@Column(name = "icon_ser")
	private String iconSer;

	@Column(name = "duracion_ser")
	private String duracionSer;


	//Use cualquiera de las relaciones @ManyToOne or @OneToMany or OneToOne
	@JoinColumn(name = "id_empresa", insertable = false, updatable = false)
	private Empresa empresa;

	//Use cualquiera de las relaciones @ManyToOne or @OneToMany or OneToOne
	@JoinColumn(name = "id_tipo_servicio", insertable = false, updatable = false)
	private TipoServicio tipo_servicio;

	//Use cualquiera de las relaciones @ManyToOne or @OneToMany or OneToOne
	@JoinColumn(name = "id_calendario_servicio", insertable = false, updatable = false)
	private CalendarioServicio calendario_servicio;

	// (Many) Un estado lo puede tener muchos clientes
	// (One) UnCliente solo puede tener un estado
	@ManyToOne
	@JoinColumn(name = "id_estado", insertable = false, updatable = false)
	private Estado estado;

	public Servicio() {}
	public Integer getIdServicio(){ return idServicio; }

	public void setIdServicio(Integer idServicio){this.idServicio = idServicio;}

	public Integer getIdEmpresa(){ return idEmpresa; }

	public void setIdEmpresa(Integer idEmpresa){this.idEmpresa = idEmpresa;}

	public Integer getIdTipoServicio(){ return idTipoServicio; }

	public void setIdTipoServicio(Integer idTipoServicio){this.idTipoServicio = idTipoServicio;}

	public Integer getIdCalendarioServicio(){ return idCalendarioServicio; }

	public void setIdCalendarioServicio(Integer idCalendarioServicio){this.idCalendarioServicio = idCalendarioServicio;}

	public Integer getIdEstado(){ return idEstado; }

	public void setIdEstado(Integer idEstado){this.idEstado = idEstado;}

	public String getNombreSer(){ return nombreSer; }

	public void setNombreSer(String nombreSer){this.nombreSer = nombreSer;}

	public String getDescripcionSer(){ return descripcionSer; }

	public void setDescripcionSer(String descripcionSer){this.descripcionSer = descripcionSer;}

	public String getIconSer(){ return iconSer; }

	public void setIconSer(String iconSer){this.iconSer = iconSer;}

	public String getDuracionSer(){ return duracionSer; }

	public void setDuracionSer(String duracionSer){this.duracionSer = duracionSer;}

}