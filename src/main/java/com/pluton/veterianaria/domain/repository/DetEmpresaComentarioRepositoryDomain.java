package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.DetEmpresaComentarioPojo;

import java.util.List;
import java.util.Optional;

public interface DetEmpresaComentarioRepositoryDomain {

	List<DetEmpresaComentarioPojo> getAll();
	Optional<DetEmpresaComentarioPojo> getDetEmpresaComentarioPojo(int idDetEmpresaComentario);
	DetEmpresaComentarioPojo save(DetEmpresaComentarioPojo detEmpresaComentarioPojo);
	void delete(int idDetEmpresaComentario);

}