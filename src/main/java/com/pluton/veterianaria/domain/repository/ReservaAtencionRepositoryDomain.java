package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.ReservaAtencionPojo;

import java.util.List;
import java.util.Optional;

public interface ReservaAtencionRepositoryDomain {

	List<ReservaAtencionPojo> getAll();
	Optional<ReservaAtencionPojo> getReservaAtencionPojo(int idCitaReservaAtencion);
	ReservaAtencionPojo save(ReservaAtencionPojo reservaAtencionPojo);
	void delete(int idCitaReservaAtencion);

}