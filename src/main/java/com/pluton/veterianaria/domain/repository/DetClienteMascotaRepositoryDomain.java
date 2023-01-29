package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.DetClienteMascotaPojo;

import java.util.List;
import java.util.Optional;

public interface DetClienteMascotaRepositoryDomain {

	List<DetClienteMascotaPojo> getAll();
	Optional<DetClienteMascotaPojo> getDetClienteMascotaPojo(int idDetClienteMascota);
	DetClienteMascotaPojo save(DetClienteMascotaPojo detClienteMascotaPojo);
	void delete(int idDetClienteMascota);

}