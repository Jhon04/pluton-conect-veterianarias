package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.CitaReservaAtencionPojo;

import java.util.List;
import java.util.Optional;

public interface CitaReservaAtencionRepositoryDomain {

	List<CitaReservaAtencionPojo> getAll();
	Optional<CitaReservaAtencionPojo> getCitaReservaAtencionPojo(int idCitaReservaAtencion);
	CitaReservaAtencionPojo save(CitaReservaAtencionPojo citaReservaAtencionPojo);
	void delete(int idCitaReservaAtencion);

}