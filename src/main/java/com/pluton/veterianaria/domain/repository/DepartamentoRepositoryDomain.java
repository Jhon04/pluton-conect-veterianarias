package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.DepartamentoPojo;

import java.util.List;
import java.util.Optional;

public interface DepartamentoRepositoryDomain {

	List<DepartamentoPojo> getAll();
	Optional<DepartamentoPojo> getDepartamentoPojo(int idDepartamento);
	DepartamentoPojo save(DepartamentoPojo departamentoPojo);
	void delete(int idDepartamento);

}