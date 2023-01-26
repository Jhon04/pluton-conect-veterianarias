package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.DepartamentoPojo;

import com.pluton.veterianaria.domain.repository.DepartamentoRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

	@Autowired
	private DepartamentoRepositoryDomain departamentoRepositoryDomain;

	public List<DepartamentoPojo> getAll(){
		return departamentoRepositoryDomain.getAll();
	}


	public Optional<DepartamentoPojo> getDepartamentoPojo(int idDepartamento){
		return departamentoRepositoryDomain.getDepartamentoPojo(idDepartamento);
	}

	public DepartamentoPojo save(DepartamentoPojo departamentoPojo){
		return departamentoRepositoryDomain.save(departamentoPojo);
	}

	public boolean delete(int idDepartamento){
		return getDepartamentoPojo(idDepartamento).map(departamentoPojo-> {
			departamentoRepositoryDomain.delete(idDepartamento);
			return true;
		}).orElse(false);
	}

}