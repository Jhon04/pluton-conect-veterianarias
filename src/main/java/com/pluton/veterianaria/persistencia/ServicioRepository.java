package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.ServicioPojo;
import com.pluton.veterianaria.domain.repository.ServicioRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.ServicioCrudRepository;
import com.pluton.veterianaria.persistencia.entity.Servicio;
import com.pluton.veterianaria.persistencia.mapper.ServicioMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class ServicioRepository implements ServicioRepositoryDomain {

	@Autowired
	private ServicioCrudRepository servicioCrudRepository;

	@Autowired
	private ServicioMapper servicioMapper;

	@Override
	public List<ServicioPojo> getAll() {
		List<Servicio> listServicio = (List<Servicio>) servicioCrudRepository.findAll();
		return servicioMapper.toListServicioPojo(listServicio);
	}

	@Override
	public Optional<ServicioPojo> getServicioPojo(int idServicio){
		return servicioCrudRepository.findById(idServicio).map(servicio -> servicioMapper.toServicioPojo(servicio));
	}

	@Override
	public ServicioPojo save(ServicioPojo servicioPojo){
		Servicio servicio = servicioMapper.toServicio(servicioPojo);
		return servicioMapper.toServicioPojo(servicioCrudRepository.save(servicio));
	}

	@Override
	public void delete (int idServicio){
		servicioCrudRepository.deleteById(idServicio);
	}

}