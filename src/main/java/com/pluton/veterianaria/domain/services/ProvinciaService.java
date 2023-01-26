package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.ProvinciaPojo;

import com.pluton.veterianaria.domain.repository.ProvinciaRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinciaService {

	@Autowired
	private ProvinciaRepositoryDomain provinciaRepositoryDomain;

	public List<ProvinciaPojo> getAll(){
		return provinciaRepositoryDomain.getAll();
	}


	public Optional<ProvinciaPojo> getProvinciaPojo(int idProvincia){
		return provinciaRepositoryDomain.getProvinciaPojo(idProvincia);
	}

	public  Optional<List<ProvinciaPojo>> getByDepartamentoPojo(int IdDepartamento) {
		return provinciaRepositoryDomain.getByDepartamentoPojo(IdDepartamento);
	}

	public ProvinciaPojo save(ProvinciaPojo provinciaPojo){
		return provinciaRepositoryDomain.save(provinciaPojo);
	}

	public boolean delete(int idProvincia){
		return getProvinciaPojo(idProvincia).map(provinciaPojo-> {
			provinciaRepositoryDomain.delete(idProvincia);
			return true;
		}).orElse(false);
	}

}