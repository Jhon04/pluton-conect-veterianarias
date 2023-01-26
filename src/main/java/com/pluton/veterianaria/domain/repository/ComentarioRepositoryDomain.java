package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.ComentarioPojo;

import java.util.List;
import java.util.Optional;

public interface ComentarioRepositoryDomain {

	List<ComentarioPojo> getAll();
	Optional<ComentarioPojo> getComentarioPojo(int idComentario);
	ComentarioPojo save(ComentarioPojo comentarioPojo);
	void delete(int idComentario);

}