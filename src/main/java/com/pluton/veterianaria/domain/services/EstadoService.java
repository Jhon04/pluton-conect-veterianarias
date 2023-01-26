package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.EstadoPojo;

import com.pluton.veterianaria.domain.repository.EstadoRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepositoryDomain estadoRepositoryDomain;

	public List<EstadoPojo> getAll(){
		return estadoRepositoryDomain.getAll();
	}


	public Optional<EstadoPojo> getEstadoPojo(int idEstado){
		return estadoRepositoryDomain.getEstadoPojo(idEstado);
	}

	public EstadoPojo save(EstadoPojo estadoPojo){
		return estadoRepositoryDomain.save(estadoPojo);
	}

	public boolean delete(int idEstado){
		return getEstadoPojo(idEstado).map(estadoPojo-> {
			estadoRepositoryDomain.delete(idEstado);
			return true;
		}).orElse(false);
	}

}