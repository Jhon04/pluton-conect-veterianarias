package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.EmpresaPojo;

import java.util.List;
import java.util.Optional;

public interface EmpresaRepositoryDomain {

	List<EmpresaPojo> getAll();
	Optional<EmpresaPojo> getEmpresaPojo(int idEmpresa);
	EmpresaPojo save(EmpresaPojo empresaPojo);
	void delete(int idEmpresa);

}