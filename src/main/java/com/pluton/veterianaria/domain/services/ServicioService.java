package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.ServicioPojo;

import com.pluton.veterianaria.domain.repository.ServicioRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioService {

	@Autowired
	private ServicioRepositoryDomain servicioRepositoryDomain;

	public List<ServicioPojo> getAll(){
		return servicioRepositoryDomain.getAll();
	}


	public Optional<ServicioPojo> getServicioPojo(int idServicio){
		return servicioRepositoryDomain.getServicioPojo(idServicio);
	}

	public ServicioPojo save(ServicioPojo servicioPojo){
		return servicioRepositoryDomain.save(servicioPojo);
	}

	public boolean delete(int idServicio){
		return getServicioPojo(idServicio).map(servicioPojo-> {
			servicioRepositoryDomain.delete(idServicio);
			return true;
		}).orElse(false);
	}

}