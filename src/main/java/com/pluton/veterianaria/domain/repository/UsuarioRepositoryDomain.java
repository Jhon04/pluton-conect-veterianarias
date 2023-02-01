package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.UsuarioPojo;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepositoryDomain {

	List<UsuarioPojo> getAll();
	Optional<List<UsuarioPojo>> getByTipoUsuarioPojo(int idTipoUsuario);
	Optional<UsuarioPojo> getUsuarioPojo(int idUsuario);
	UsuarioPojo getUsuarioPojoXNombreUsuario(String nombreUsuario);
	UsuarioPojo save(UsuarioPojo usuarioPojo);
	void delete(int idUsuario);

}