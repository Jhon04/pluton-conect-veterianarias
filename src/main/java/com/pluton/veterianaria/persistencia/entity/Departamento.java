package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="departamento")
public class Departamento implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_departamento")
	private Integer idDepartamento;

	@Column(name = "id_estado")
	private Integer idEstado;

	@Column(name = "nombre_dep")
	private String nombreDep;


	// (Many) Un estado lo puede tener muchos clientes
	// (One) UnCliente solo puede tener un estado
	@ManyToOne
	@JoinColumn(name = "id_estado", insertable = false, updatable = false)
	private Estado estado;

	public Departamento() {}
	public Integer getIdDepartamento(){ return idDepartamento; }

	public void setIdDepartamento(Integer idDepartamento){this.idDepartamento = idDepartamento;}

	public Integer getIdEstado(){ return idEstado; }

	public void setIdEstado(Integer idEstado){this.idEstado = idEstado;}

	public String getNombreDep(){ return nombreDep; }

	public void setNombreDep(String nombreDep){this.nombreDep = nombreDep;}

}