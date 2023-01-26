package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.MascotaPojo;

import com.pluton.veterianaria.domain.repository.MascotaRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MascotaService {

	@Autowired
	private MascotaRepositoryDomain mascotaRepositoryDomain;

	public List<MascotaPojo> getAll(){
		return mascotaRepositoryDomain.getAll();
	}


	public Optional<MascotaPojo> getMascotaPojo(int idMascota){
		return mascotaRepositoryDomain.getMascotaPojo(idMascota);
	}

	public MascotaPojo save(MascotaPojo mascotaPojo){
		return mascotaRepositoryDomain.save(mascotaPojo);
	}

	public boolean delete(int idMascota){
		return getMascotaPojo(idMascota).map(mascotaPojo-> {
			mascotaRepositoryDomain.delete(idMascota);
			return true;
		}).orElse(false);
	}

}