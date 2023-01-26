package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.TipoMascotaPojo;

import java.util.List;
import java.util.Optional;

public interface TipoMascotaRepositoryDomain {

	List<TipoMascotaPojo> getAll();
	Optional<TipoMascotaPojo> getTipoMascotaPojo(int idTipoMascota);
	TipoMascotaPojo save(TipoMascotaPojo tipoMascotaPojo);
	void delete(int idTipoMascota);

}