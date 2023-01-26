package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.RazaPojo;

import java.util.List;
import java.util.Optional;

public interface RazaRepositoryDomain {

	List<RazaPojo> getAll();
	Optional<RazaPojo> getRazaPojo(int idRaza);
	RazaPojo save(RazaPojo razaPojo);
	void delete(int idRaza);

}