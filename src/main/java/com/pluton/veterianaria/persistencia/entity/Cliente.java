package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name ="cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Integer idCliente;

	@Column(name = "id_usuario")
	private Integer idUsuario;

	@Column(name = "id_distrito")
	private Integer idDistrito;

	@Column(name = "direccion_cli")
	private String direccionCli;

	@Column(name = "nombre_cli")
	private String nombreCli;

	@Column(name = "ape_paterno_cli")
	private String apePaternoCli;

	@Column(name = "ape_materno_cli")
	private String apeMaternoCli;

	@Column(name = "dni_cli")
	private String dniCli;

	@Column(name = "ubicacion_cli")
	private String ubicacionCli;

	@Column(name = "email_cli")
	private String emailCli;

	@Column(name = "celular_cli")
	private String celularCli;

	@Column(name = "img_cli")
	private String imgCli;

	@Column(name = "img_back_cli")
	private String imgBackCli;

	@Column(name = "fecha_mod")
	private Date fechaMod;

	@Column(name = "user_mod")
	private Integer userMod;

	@Column(name = "id_estado")
	private Integer idEstado;


	// (One) Un *Usuario solo lo puede tener un *Cliente
	// (One) Un *Cliente solo puede tener un *Usuario
	@OneToOne
	@JoinColumn(name = "id_usuario", insertable = false, updatable = false)
	private Usuario usuario;

	// (Many) En un *Distrito pueden vivir varios *Clientes
	// (One) Un *Cliente solo puede tener un *Usuario
	@ManyToOne
	@JoinColumn(name = "id_distrito", insertable = false, updatable = false)
	private Distrito distrito;

	// (Many) Un estado lo puede tener muchos *clientes
	// (One) Un *Cliente solo puede tener un estado
	@ManyToOne
	@JoinColumn(name = "id_estado", insertable = false, updatable = false)
	private Estado estado;

	public Cliente() {}
	public Integer getIdCliente(){ return idCliente; }

	public void setIdCliente(Integer idCliente){this.idCliente = idCliente;}

	public Integer getIdUsuario(){ return idUsuario; }

	public void setIdUsuario(Integer idUsuario){this.idUsuario = idUsuario;}

	public Integer getIdDistrito(){ return idDistrito; }

	public void setIdDistrito(Integer idDistrito){this.idDistrito = idDistrito;}

	public String getDireccionCli(){ return direccionCli; }

	public void setDireccionCli(String direccionCli){this.direccionCli = direccionCli;}

	public String getNombreCli(){ return nombreCli; }

	public void setNombreCli(String nombreCli){this.nombreCli = nombreCli;}

	public String getApePaternoCli(){ return apePaternoCli; }

	public void setApePaternoCli(String apePaternoCli){this.apePaternoCli = apePaternoCli;}

	public String getApeMaternoCli(){ return apeMaternoCli; }

	public void setApeMaternoCli(String apeMaternoCli){this.apeMaternoCli = apeMaternoCli;}

	public String getUbicacionCli(){ return ubicacionCli; }

	public void setUbicacionCli(String ubicacionCli){this.ubicacionCli = ubicacionCli;}

	public String getEmailCli(){ return emailCli; }

	public void setEmailCli(String emailCli){this.emailCli = emailCli;}

	public String getCelularCli(){ return celularCli; }

	public void setCelularCli(String celularCli){this.celularCli = celularCli;}

	public String getImgCli(){ return imgCli; }

	public void setImgCli(String imgCli){this.imgCli = imgCli;}

	public String getImgBackCli(){ return imgBackCli; }

	public void setImgBackCli(String imgBackCli){this.imgBackCli = imgBackCli;}

	public Date getFechaMod(){ return fechaMod; }

	public void setFechaMod(Date fechaMod){this.fechaMod = fechaMod;}

	public Integer getUserMod(){ return userMod; }

	public void setUserMod(Integer userMod){this.userMod = userMod;}

	public Integer getIdEstado(){ return idEstado; }

	public void setIdEstado(Integer idEstado){this.idEstado = idEstado;}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getDniCli() {
		return dniCli;
	}

	public void setDniCli(String dniCli) {
		this.dniCli = dniCli;
	}
}