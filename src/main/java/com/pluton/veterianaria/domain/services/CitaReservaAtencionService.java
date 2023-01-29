package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.CitaReservaAtencionPojo;

import com.pluton.veterianaria.domain.repository.CitaReservaAtencionRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitaReservaAtencionService {

	@Autowired
	private CitaReservaAtencionRepositoryDomain citaReservaAtencionRepositoryDomain;

	public List<CitaReservaAtencionPojo> getAll(){
		return citaReservaAtencionRepositoryDomain.getAll();
	}


	public Optional<CitaReservaAtencionPojo> getCitaReservaAtencionPojo(int idCitaReservaAtencion){
		return citaReservaAtencionRepositoryDomain.getCitaReservaAtencionPojo(idCitaReservaAtencion);
	}

	public CitaReservaAtencionPojo save(CitaReservaAtencionPojo citaReservaAtencionPojo){
		return citaReservaAtencionRepositoryDomain.save(citaReservaAtencionPojo);
	}

	public boolean delete(int idCitaReservaAtencion){
		return getCitaReservaAtencionPojo(idCitaReservaAtencion).map(citaReservaAtencionPojo-> {
			citaReservaAtencionRepositoryDomain.delete(idCitaReservaAtencion);
			return true;
		}).orElse(false);
	}

}