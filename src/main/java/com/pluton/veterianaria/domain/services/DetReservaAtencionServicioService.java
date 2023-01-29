package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.DetReservaAtencionServicioPojo;

import com.pluton.veterianaria.domain.repository.DetReservaAtencionServicioRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetReservaAtencionServicioService {

	@Autowired
	private DetReservaAtencionServicioRepositoryDomain detReservaAtencionServicioRepositoryDomain;

	public List<DetReservaAtencionServicioPojo> getAll(){
		return detReservaAtencionServicioRepositoryDomain.getAll();
	}


	public Optional<DetReservaAtencionServicioPojo> getDetReservaAtencionServicioPojo(int idDetReservaServicio){
		return detReservaAtencionServicioRepositoryDomain.getDetReservaAtencionServicioPojo(idDetReservaServicio);
	}

	public DetReservaAtencionServicioPojo save(DetReservaAtencionServicioPojo detReservaAtencionServicioPojo){
		return detReservaAtencionServicioRepositoryDomain.save(detReservaAtencionServicioPojo);
	}

	public boolean delete(int idDetReservaServicio){
		return getDetReservaAtencionServicioPojo(idDetReservaServicio).map(detReservaAtencionServicioPojo-> {
			detReservaAtencionServicioRepositoryDomain.delete(idDetReservaServicio);
			return true;
		}).orElse(false);
	}

}