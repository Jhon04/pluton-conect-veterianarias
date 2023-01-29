package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.DetClienteMascotaPojo;

import com.pluton.veterianaria.domain.repository.DetClienteMascotaRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetClienteMascotaService {

	@Autowired
	private DetClienteMascotaRepositoryDomain detClienteMascotaRepositoryDomain;

	public List<DetClienteMascotaPojo> getAll(){
		return detClienteMascotaRepositoryDomain.getAll();
	}


	public Optional<DetClienteMascotaPojo> getDetClienteMascotaPojo(int idDetClienteMascota){
		return detClienteMascotaRepositoryDomain.getDetClienteMascotaPojo(idDetClienteMascota);
	}

	public DetClienteMascotaPojo save(DetClienteMascotaPojo detClienteMascotaPojo){
		return detClienteMascotaRepositoryDomain.save(detClienteMascotaPojo);
	}

	public boolean delete(int idDetClienteMascota){
		return getDetClienteMascotaPojo(idDetClienteMascota).map(detClienteMascotaPojo-> {
			detClienteMascotaRepositoryDomain.delete(idDetClienteMascota);
			return true;
		}).orElse(false);
	}

}