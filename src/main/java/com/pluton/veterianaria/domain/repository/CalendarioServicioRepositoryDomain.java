package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.CalendarioServicioPojo;
import com.pluton.veterianaria.domain.ClientePojo;

import java.util.List;
import java.util.Optional;

public interface CalendarioServicioRepositoryDomain {

	List<CalendarioServicioPojo> getAll();

	Optional<CalendarioServicioPojo> getCalendarioServicioPojo(int idCalendarioServicio);
	CalendarioServicioPojo save(CalendarioServicioPojo calendarioServicioPojo);
	void delete(int idCalendarioServicio);

}