package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.HistorialClinicoPojo;

import java.util.List;
import java.util.Optional;

public interface HistorialClinicoRepositoryDomain {

	List<HistorialClinicoPojo> getAll();
	Optional<HistorialClinicoPojo> getHistorialClinicoPojo(int idHistorialClinico);
	HistorialClinicoPojo save(HistorialClinicoPojo historialClinicoPojo);
	void delete(int idHistorialClinico);

}