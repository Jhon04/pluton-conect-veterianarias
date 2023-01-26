package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.ProvinciaPojo;

import java.util.List;
import java.util.Optional;

public interface ProvinciaRepositoryDomain {

	List<ProvinciaPojo> getAll();
	Optional<List<ProvinciaPojo>> getByDepartamentoPojo(int IdDepartamento);
	Optional<ProvinciaPojo> getProvinciaPojo(int idProvincia);
	ProvinciaPojo save(ProvinciaPojo provinciaPojo);
	void delete(int idProvincia);

}