package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.DetEmpresaComentarioPojo;

import com.pluton.veterianaria.domain.repository.DetEmpresaComentarioRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetEmpresaComentarioService {

	@Autowired
	private DetEmpresaComentarioRepositoryDomain detEmpresaComentarioRepositoryDomain;

	public List<DetEmpresaComentarioPojo> getAll(){
		return detEmpresaComentarioRepositoryDomain.getAll();
	}


	public Optional<DetEmpresaComentarioPojo> getDetEmpresaComentarioPojo(int idDetEmpresaComentario){
		return detEmpresaComentarioRepositoryDomain.getDetEmpresaComentarioPojo(idDetEmpresaComentario);
	}

	public DetEmpresaComentarioPojo save(DetEmpresaComentarioPojo detEmpresaComentarioPojo){
		return detEmpresaComentarioRepositoryDomain.save(detEmpresaComentarioPojo);
	}

	public boolean delete(int idDetEmpresaComentario){
		return getDetEmpresaComentarioPojo(idDetEmpresaComentario).map(detEmpresaComentarioPojo-> {
			detEmpresaComentarioRepositoryDomain.delete(idDetEmpresaComentario);
			return true;
		}).orElse(false);
	}

}