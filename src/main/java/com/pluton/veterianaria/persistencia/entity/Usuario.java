package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Integer idUsuario;

	@Column(name = "id_tipo_usuario")
	private Integer idTipoUsuario;

	@Column(name = "id_estado")
	private Integer idEstado;

	@Column(name = "email_usu")
	private String emailUsu;

	@Column(name = "password_usu")
	private String passwordUsu;


	// (Many) Un *Tipo_de_usuario puede tener multiples usuario
	// (One) Un *Usuario solo puede tener un tipo de usuario
	@ManyToOne
	@JoinColumn(name = "id_tipo_usuario", insertable = false, updatable = false)
	private TipoUsuario tipo_usuario;

	// (Many) Un estado lo puede tener muchos clientes
	// (One) UnCliente solo puede tener un estado
	@ManyToOne
	@JoinColumn(name = "id_estado", insertable = false, updatable = false)
	private Estado estado;

	public Usuario() {}
	public Integer getIdUsuario(){ return idUsuario; }

	public void setIdUsuario(Integer idUsuario){this.idUsuario = idUsuario;}

	public Integer getIdTipoUsuario(){ return idTipoUsuario; }

	public void setIdTipoUsuario(Integer idTipoUsuario){this.idTipoUsuario = idTipoUsuario;}

	public Integer getIdEstado(){ return idEstado; }

	public void setIdEstado(Integer idEstado){this.idEstado = idEstado;}

	public String getEmailUsu(){ return emailUsu; }

	public void setEmailUsu(String emailUsu){this.emailUsu = emailUsu;}

	public String getPasswordUsu(){ return passwordUsu; }

	public void setPasswordUsu(String passwordUsu){this.passwordUsu = passwordUsu;}

}