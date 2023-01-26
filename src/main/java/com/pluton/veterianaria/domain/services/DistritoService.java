package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.DistritoPojo;

import com.pluton.veterianaria.domain.repository.DistritoRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DistritoService {

	@Autowired
	private DistritoRepositoryDomain distritoRepositoryDomain;

	public List<DistritoPojo> getAll(){
		return distritoRepositoryDomain.getAll();
	}


	public Optional<DistritoPojo> getDistritoPojo(int idDistrito){
		return distritoRepositoryDomain.getDistritoPojo(idDistrito);
	}

	public DistritoPojo save(DistritoPojo distritoPojo){
		return distritoRepositoryDomain.save(distritoPojo);
	}

	public boolean delete(int idDistrito){
		return getDistritoPojo(idDistrito).map(distritoPojo-> {
			distritoRepositoryDomain.delete(idDistrito);
			return true;
		}).orElse(false);
	}

}