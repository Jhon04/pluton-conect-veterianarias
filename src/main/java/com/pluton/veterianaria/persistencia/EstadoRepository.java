package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.EstadoPojo;
import com.pluton.veterianaria.domain.repository.EstadoRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.EstadoCrudRepository;
import com.pluton.veterianaria.persistencia.entity.Estado;
import com.pluton.veterianaria.persistencia.mapper.EstadoMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class EstadoRepository implements EstadoRepositoryDomain {

	@Autowired
	private EstadoCrudRepository estadoCrudRepository;

	@Autowired
	private EstadoMapper estadoMapper;

	@Override
	public List<EstadoPojo> getAll() {
		List<Estado> listEstado = (List<Estado>) estadoCrudRepository.findAll();
		return estadoMapper.toListEstadoPojo(listEstado);
	}

	@Override
	public Optional<EstadoPojo> getEstadoPojo(int idEstado){
		return estadoCrudRepository.findById(idEstado).map(estado -> estadoMapper.toEstadoPojo(estado));
	}

	@Override
	public EstadoPojo save(EstadoPojo estadoPojo){
		Estado estado = estadoMapper.toEstado(estadoPojo);
		return estadoMapper.toEstadoPojo(estadoCrudRepository.save(estado));
	}

	@Override
	public void delete (int idEstado){
		estadoCrudRepository.deleteById(idEstado);
	}

}