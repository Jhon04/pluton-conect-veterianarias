package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.CalendarioServicioPojo;

import com.pluton.veterianaria.domain.repository.CalendarioServicioRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioServicioService {

	@Autowired
	private CalendarioServicioRepositoryDomain calendarioServicioRepositoryDomain;

	public List<CalendarioServicioPojo> getAll(){
		return calendarioServicioRepositoryDomain.getAll();
	}


	public Optional<CalendarioServicioPojo> getCalendarioServicioPojo(int idCalendarioServicio){
		return calendarioServicioRepositoryDomain.getCalendarioServicioPojo(idCalendarioServicio);
	}

	public CalendarioServicioPojo save(CalendarioServicioPojo calendarioServicioPojo){
		return calendarioServicioRepositoryDomain.save(calendarioServicioPojo);
	}

	public boolean delete(int idCalendarioServicio){
		return getCalendarioServicioPojo(idCalendarioServicio).map(calendarioServicioPojo-> {
			calendarioServicioRepositoryDomain.delete(idCalendarioServicio);
			return true;
		}).orElse(false);
	}

}