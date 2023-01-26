package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.ReservaAtencionPojo;

import com.pluton.veterianaria.domain.repository.ReservaAtencionRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaAtencionService {

	@Autowired
	private ReservaAtencionRepositoryDomain reservaAtencionRepositoryDomain;

	public List<ReservaAtencionPojo> getAll(){
		return reservaAtencionRepositoryDomain.getAll();
	}


	public Optional<ReservaAtencionPojo> getReservaAtencionPojo(int idCitaReservaAtencion){
		return reservaAtencionRepositoryDomain.getReservaAtencionPojo(idCitaReservaAtencion);
	}

	public ReservaAtencionPojo save(ReservaAtencionPojo reservaAtencionPojo){
		return reservaAtencionRepositoryDomain.save(reservaAtencionPojo);
	}

	public boolean delete(int idCitaReservaAtencion){
		return getReservaAtencionPojo(idCitaReservaAtencion).map(reservaAtencionPojo-> {
			reservaAtencionRepositoryDomain.delete(idCitaReservaAtencion);
			return true;
		}).orElse(false);
	}

}