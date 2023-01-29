package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.EmpresaPojo;

import com.pluton.veterianaria.domain.repository.EmpresaRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepositoryDomain empresaRepositoryDomain;

	public List<EmpresaPojo> getAll(){
		return empresaRepositoryDomain.getAll();
	}


	public Optional<EmpresaPojo> getEmpresaPojo(int idEmpresa){
		return empresaRepositoryDomain.getEmpresaPojo(idEmpresa);
	}

	public EmpresaPojo save(EmpresaPojo empresaPojo){
		return empresaRepositoryDomain.save(empresaPojo);
	}

	public boolean delete(int idEmpresa){
		return getEmpresaPojo(idEmpresa).map(empresaPojo-> {
			empresaRepositoryDomain.delete(idEmpresa);
			return true;
		}).orElse(false);
	}

	public EmpresaPojo saveComentario(EmpresaPojo empresaPojo) {
		return empresaRepositoryDomain.save(empresaPojo);
	}

}