package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.DetReservaAtencionServicioPojo;
import com.pluton.veterianaria.domain.repository.DetReservaAtencionServicioRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.DetReservaAtencionServicioCrudRepository;
import com.pluton.veterianaria.persistencia.entity.DetReservaAtencionServicio;
import com.pluton.veterianaria.persistencia.mapper.DetReservaAtencionServicioMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class DetReservaAtencionServicioRepository implements DetReservaAtencionServicioRepositoryDomain {

	@Autowired
	private DetReservaAtencionServicioCrudRepository detReservaAtencionServicioCrudRepository;

	@Autowired
	private DetReservaAtencionServicioMapper detReservaAtencionServicioMapper;

	@Override
	public List<DetReservaAtencionServicioPojo> getAll() {
		List<DetReservaAtencionServicio> listDetReservaAtencionServicio = (List<DetReservaAtencionServicio>) detReservaAtencionServicioCrudRepository.findAll();
		return detReservaAtencionServicioMapper.toListDetReservaAtencionServicioPojo(listDetReservaAtencionServicio);
	}

	@Override
	public Optional<DetReservaAtencionServicioPojo> getDetReservaAtencionServicioPojo(int idDetReservaServicio){
		return detReservaAtencionServicioCrudRepository.findById(idDetReservaServicio).map(detReservaAtencionServicio -> detReservaAtencionServicioMapper.toDetReservaAtencionServicioPojo(detReservaAtencionServicio));
	}

	@Override
	public DetReservaAtencionServicioPojo save(DetReservaAtencionServicioPojo detReservaAtencionServicioPojo){
		DetReservaAtencionServicio detReservaAtencionServicio = detReservaAtencionServicioMapper.toDetReservaAtencionServicio(detReservaAtencionServicioPojo);
		return detReservaAtencionServicioMapper.toDetReservaAtencionServicioPojo(detReservaAtencionServicioCrudRepository.save(detReservaAtencionServicio));
	}

	@Override
	public void delete (int idDetReservaServicio){
		detReservaAtencionServicioCrudRepository.deleteById(idDetReservaServicio);
	}

}