package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.DetReservaAtencionServicioPojo;

import java.util.List;
import java.util.Optional;

public interface DetReservaAtencionServicioRepositoryDomain {

	List<DetReservaAtencionServicioPojo> getAll();
	Optional<DetReservaAtencionServicioPojo> getDetReservaAtencionServicioPojo(int idDetReservaServicio);
	DetReservaAtencionServicioPojo save(DetReservaAtencionServicioPojo detReservaAtencionServicioPojo);
	void delete(int idDetReservaServicio);

}