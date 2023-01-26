package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.CalendarioServicioPojo;
import com.pluton.veterianaria.domain.repository.CalendarioServicioRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.CalendarioServicioCrudRepository;
import com.pluton.veterianaria.persistencia.entity.CalendarioServicio;
import com.pluton.veterianaria.persistencia.mapper.CalendarioServicioMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class CalendarioServicioRepository implements CalendarioServicioRepositoryDomain {

	@Autowired
	private CalendarioServicioCrudRepository calendarioServicioCrudRepository;

	@Autowired
	private CalendarioServicioMapper calendarioServicioMapper;

	@Override
	public List<CalendarioServicioPojo> getAll() {
		List<CalendarioServicio> listCalendarioServicio = (List<CalendarioServicio>) calendarioServicioCrudRepository.findAll();
		return calendarioServicioMapper.toListCalendarioServicioPojo(listCalendarioServicio);
	}

	@Override
	public Optional<CalendarioServicioPojo> getCalendarioServicioPojo(int idCalendarioServicio){
		return calendarioServicioCrudRepository.findById(idCalendarioServicio).map(calendarioServicio -> calendarioServicioMapper.toCalendarioServicioPojo(calendarioServicio));
	}

	@Override
	public CalendarioServicioPojo save(CalendarioServicioPojo calendarioServicioPojo){
		CalendarioServicio calendarioServicio = calendarioServicioMapper.toCalendarioServicio(calendarioServicioPojo);
		return calendarioServicioMapper.toCalendarioServicioPojo(calendarioServicioCrudRepository.save(calendarioServicio));
	}

	@Override
	public void delete (int idCalendarioServicio){
		calendarioServicioCrudRepository.deleteById(idCalendarioServicio);
	}

}