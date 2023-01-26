package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.TipoServicioPojo;
import com.pluton.veterianaria.domain.repository.TipoServicioRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.TipoServicioCrudRepository;
import com.pluton.veterianaria.persistencia.entity.TipoServicio;
import com.pluton.veterianaria.persistencia.mapper.TipoServicioMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class TipoServicioRepository implements TipoServicioRepositoryDomain {

	@Autowired
	private TipoServicioCrudRepository tipoServicioCrudRepository;

	@Autowired
	private TipoServicioMapper tipoServicioMapper;

	@Override
	public List<TipoServicioPojo> getAll() {
		List<TipoServicio> listTipoServicio = (List<TipoServicio>) tipoServicioCrudRepository.findAll();
		return tipoServicioMapper.toListTipoServicioPojo(listTipoServicio);
	}

	@Override
	public Optional<TipoServicioPojo> getTipoServicioPojo(int idTipoServicio){
		return tipoServicioCrudRepository.findById(idTipoServicio).map(tipoServicio -> tipoServicioMapper.toTipoServicioPojo(tipoServicio));
	}

	@Override
	public TipoServicioPojo save(TipoServicioPojo tipoServicioPojo){
		TipoServicio tipoServicio = tipoServicioMapper.toTipoServicio(tipoServicioPojo);
		return tipoServicioMapper.toTipoServicioPojo(tipoServicioCrudRepository.save(tipoServicio));
	}

	@Override
	public void delete (int idTipoServicio){
		tipoServicioCrudRepository.deleteById(idTipoServicio);
	}

}