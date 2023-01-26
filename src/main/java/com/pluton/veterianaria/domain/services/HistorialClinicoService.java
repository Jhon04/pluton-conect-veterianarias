package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.HistorialClinicoPojo;

import com.pluton.veterianaria.domain.repository.HistorialClinicoRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistorialClinicoService {

	@Autowired
	private HistorialClinicoRepositoryDomain historialClinicoRepositoryDomain;

	public List<HistorialClinicoPojo> getAll(){
		return historialClinicoRepositoryDomain.getAll();
	}


	public Optional<HistorialClinicoPojo> getHistorialClinicoPojo(int idHistorialClinico){
		return historialClinicoRepositoryDomain.getHistorialClinicoPojo(idHistorialClinico);
	}

	public HistorialClinicoPojo save(HistorialClinicoPojo historialClinicoPojo){
		return historialClinicoRepositoryDomain.save(historialClinicoPojo);
	}

	public boolean delete(int idHistorialClinico){
		return getHistorialClinicoPojo(idHistorialClinico).map(historialClinicoPojo-> {
			historialClinicoRepositoryDomain.delete(idHistorialClinico);
			return true;
		}).orElse(false);
	}

}