package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="provincia")
public class Provincia implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_provincia")
	private Integer idProvincia;

	@Column(name = "id_departamento")
	private Integer idDepartamento;

	@Column(name = "nombre_pro")
	private String nombrePro;


	//Use cualquiera de las relaciones @ManyToOne or @OneToMany or OneToOne
	@ManyToOne
	@JoinColumn(name = "id_departamento", insertable = false, updatable = false)
	private Departamento departamento;

	public Provincia() {}
	public Integer getIdProvincia(){ return idProvincia; }

	public void setIdProvincia(Integer idProvincia){this.idProvincia = idProvincia;}

	public Integer getIdDepartamento(){ return idDepartamento; }

	public void setIdDepartamento(Integer idDepartamento){this.idDepartamento = idDepartamento;}

	public String getNombrePro(){ return nombrePro; }

	public void setNombrePro(String nombrePro){this.nombrePro = nombrePro;}

}