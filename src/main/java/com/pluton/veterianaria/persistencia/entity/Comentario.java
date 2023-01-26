package com.pluton.veterianaria.persistencia.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name ="comentario")
public class Comentario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_comentario")
	private Integer idComentario;

	@Column(name = "id_cliente")
	private Integer idCliente;

	@Column(name = "id_estado")
	private Integer idEstado;

	@Column(name = "titulo_com")
	private Date tituloCom;

	@Column(name = "comentario")
	private String comentario;


	// (Many) Un *Cliente puede tener muchos *Comentarios
	// (One) Un *Comentario solo le pertenece a un *Cliente
	@ManyToOne
	@JoinColumn(name = "id_cliente", insertable = false, updatable = false)
	private Cliente cliente;

	// (Many) Un estado lo puede tener muchos clientes
	// (One) UnCliente solo puede tener un estado
	@ManyToOne
	@JoinColumn(name = "id_estado", insertable = false, updatable = false)
	private Estado estado;

	@ManyToMany(mappedBy = "comentarios")
	private List<Empresa> empresas;

	public Comentario() {}
	public Integer getIdComentario(){ return idComentario; }

	public void setIdComentario(Integer idComentario){this.idComentario = idComentario;}

	public Integer getIdCliente(){ return idCliente; }

	public void setIdCliente(Integer idCliente){this.idCliente = idCliente;}

	public Integer getIdEstado(){ return idEstado; }

	public void setIdEstado(Integer idEstado){this.idEstado = idEstado;}

	public Date getTituloCom(){ return tituloCom; }

	public void setTituloCom(Date tituloCom){this.tituloCom = tituloCom;}

	public String getComentario(){ return comentario; }

	public void setComentario(String comentario){this.comentario = comentario;}

}