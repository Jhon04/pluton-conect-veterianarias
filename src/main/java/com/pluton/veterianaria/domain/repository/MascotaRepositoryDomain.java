package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.MascotaPojo;

import java.util.List;
import java.util.Optional;

public interface MascotaRepositoryDomain {

	List<MascotaPojo> getAll();
	Optional<MascotaPojo> getMascotaPojo(int idMascota);
	MascotaPojo save(MascotaPojo mascotaPojo);
	void delete(int idMascota);

}