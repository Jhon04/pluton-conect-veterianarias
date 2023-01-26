package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.ServicioPojo;

import java.util.List;
import java.util.Optional;

public interface ServicioRepositoryDomain {

	List<ServicioPojo> getAll();
	Optional<ServicioPojo> getServicioPojo(int idServicio);
	ServicioPojo save(ServicioPojo servicioPojo);
	void delete(int idServicio);

}