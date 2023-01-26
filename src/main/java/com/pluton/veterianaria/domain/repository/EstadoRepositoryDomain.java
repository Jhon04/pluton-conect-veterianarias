package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.EstadoPojo;

import java.util.List;
import java.util.Optional;

public interface EstadoRepositoryDomain {

	List<EstadoPojo> getAll();
	Optional<EstadoPojo> getEstadoPojo(int idEstado);
	EstadoPojo save(EstadoPojo estadoPojo);
	void delete(int idEstado);

}