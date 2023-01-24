package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.TipoMascotaPojo;
import com.pluton.veterianaria.domain.repository.TipoMascotaRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.TipoMascotaCrudRepository;
import com.pluton.veterianaria.persistencia.entity.TipoMascota;
import com.pluton.veterianaria.persistencia.mapper.TipoMascotaMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TipoMascotaRepository implements TipoMascotaRepositoryDomain {

	@Autowired
	private TipoMascotaCrudRepository tipoMascotaCrudRepository;

	@Autowired
	private TipoMascotaMapper tipoMascotaMapper;

	@Override
	public List<TipoMascotaPojo> getAll() {
		List<TipoMascota> tipoMascotas = (List<TipoMascota>) tipoMascotaCrudRepository.findAll();
		return tipoMascotaMapper.toListTipoMascotaPojo(tipoMascotas);
	}

	@Override
	public TipoMascotaPojo save(TipoMascotaPojo tipoMascotaPojo) {
		return null;
	}

	@Override
	public void delete(int tipoMascotaId) {

	}
}