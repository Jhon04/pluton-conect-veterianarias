package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name ="empresa")
public class Empresa implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empresa")
	private Integer idEmpresa;

	@Column(name = "id_usuario")
	private Integer idUsuario;

	@Column(name = "id_distrito")
	private Integer idDistrito;

	@Column(name = "nombre_emp")
	private String nombreEmp;

	@Column(name = "descripcion_emp")
	private String descripcionEmp;

	@Column(name = "email_emp")
	private String emailEmp;

	@Column(name = "celular_emp")
	private String celularEmp;

	@Column(name = "img_back_emp")
	private String imgBackEmp;

	@Column(name = "img_emp")
	private String imgEmp;

	@Column(name = "direccion_emp")
	private String direccionEmp;

	@Column(name = "ubicacion_emp")
	private String ubicacionEmp;

	@Column(name = "calificacion_emp")
	private Boolean calificacionEmp;

	@Column(name = "verificacion_emp")
	private Boolean verificacionEmp;

	@Column(name = "estado")
	private Date estado;

	@Column(name = "fecha_mod")
	private Integer fechaMod;


	//Use cualquiera de las relaciones @ManyToOne or @OneToMany or OneToOne
	@JoinColumn(name = "id_usuario", insertable = false, updatable = false)
	private Usuario usuario;

	//Use cualquiera de las relaciones @ManyToOne or @OneToMany or OneToOne
	@ManyToOne
	@JoinColumn(name = "id_distrito", insertable = false, updatable = false)
	private Distrito distrito;

	public Empresa() {}
	public Integer getIdEmpresa(){ return idEmpresa; }

	public void setIdEmpresa(Integer idEmpresa){this.idEmpresa = idEmpresa;}

	public Integer getIdUsuario(){ return idUsuario; }

	public void setIdUsuario(Integer idUsuario){this.idUsuario = idUsuario;}

	public Integer getIdDistrito(){ return idDistrito; }

	public void setIdDistrito(Integer idDistrito){this.idDistrito = idDistrito;}

	public String getNombreEmp(){ return nombreEmp; }

	public void setNombreEmp(String nombreEmp){this.nombreEmp = nombreEmp;}

	public String getDescripcionEmp(){ return descripcionEmp; }

	public void setDescripcionEmp(String descripcionEmp){this.descripcionEmp = descripcionEmp;}

	public String getEmailEmp(){ return emailEmp; }

	public void setEmailEmp(String emailEmp){this.emailEmp = emailEmp;}

	public String getCelularEmp(){ return celularEmp; }

	public void setCelularEmp(String celularEmp){this.celularEmp = celularEmp;}

	public String getImgBackEmp(){ return imgBackEmp; }

	public void setImgBackEmp(String imgBackEmp){this.imgBackEmp = imgBackEmp;}

	public String getImgEmp(){ return imgEmp; }

	public void setImgEmp(String imgEmp){this.imgEmp = imgEmp;}

	public String getDireccionEmp(){ return direccionEmp; }

	public void setDireccionEmp(String direccionEmp){this.direccionEmp = direccionEmp;}

	public String getUbicacionEmp(){ return ubicacionEmp; }

	public void setUbicacionEmp(String ubicacionEmp){this.ubicacionEmp = ubicacionEmp;}

	public Boolean getCalificacionEmp(){ return calificacionEmp; }

	public void setCalificacionEmp(Boolean calificacionEmp){this.calificacionEmp = calificacionEmp;}

	public Boolean getVerificacionEmp(){ return verificacionEmp; }

	public void setVerificacionEmp(Boolean verificacionEmp){this.verificacionEmp = verificacionEmp;}

	public Date getEstado(){ return estado; }

	public void setEstado(Date estado){this.estado = estado;}

	public Integer getFechaMod(){ return fechaMod; }

	public void setFechaMod(Integer fechaMod){this.fechaMod = fechaMod;}

}