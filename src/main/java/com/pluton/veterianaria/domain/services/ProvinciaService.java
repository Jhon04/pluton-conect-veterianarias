package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.ClientePojo;
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

	public List<ProvinciaPojo> getAll() {
		return provinciaRepositoryDomain.getAll();
	}

	public Optional<ProvinciaPojo> getProvincia(int IdProvincia) {
		return provinciaRepositoryDomain.getProvincia(IdProvincia);
	}

	public  Optional<List<ProvinciaPojo>> getByDepartamento(int IdDepartamento) {
		return provinciaRepositoryDomain.getByDepartamento(IdDepartamento);
	}

	public ProvinciaPojo save(ProvinciaPojo provincia){
		return provinciaRepositoryDomain.save(provincia);
	}

	public boolean delete(int IdProvincia){

		return getProvincia(IdProvincia).map(prov -> {
			provinciaRepositoryDomain.delete(IdProvincia);
			return true;
		}).orElse(false);
	}

}