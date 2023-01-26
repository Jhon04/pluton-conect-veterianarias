package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.RazaPojo;

import com.pluton.veterianaria.domain.repository.RazaRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RazaService {

	@Autowired
	private RazaRepositoryDomain razaRepositoryDomain;

	public List<RazaPojo> getAll(){
		return razaRepositoryDomain.getAll();
	}


	public Optional<RazaPojo> getRazaPojo(int idRaza){
		return razaRepositoryDomain.getRazaPojo(idRaza);
	}

	public RazaPojo save(RazaPojo razaPojo){
		return razaRepositoryDomain.save(razaPojo);
	}

	public boolean delete(int idRaza){
		return getRazaPojo(idRaza).map(razaPojo-> {
			razaRepositoryDomain.delete(idRaza);
			return true;
		}).orElse(false);
	}

}