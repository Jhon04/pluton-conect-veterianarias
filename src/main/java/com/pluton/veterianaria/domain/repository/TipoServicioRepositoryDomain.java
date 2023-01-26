package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.TipoServicioPojo;

import java.util.List;
import java.util.Optional;

public interface TipoServicioRepositoryDomain {

	List<TipoServicioPojo> getAll();
	Optional<TipoServicioPojo> getTipoServicioPojo(int idTipoServicio);
	TipoServicioPojo save(TipoServicioPojo tipoServicioPojo);
	void delete(int idTipoServicio);

}