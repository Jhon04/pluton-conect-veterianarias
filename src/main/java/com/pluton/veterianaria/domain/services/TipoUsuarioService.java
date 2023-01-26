package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.TipoUsuarioPojo;

import com.pluton.veterianaria.domain.repository.TipoUsuarioRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoUsuarioService {

	@Autowired
	private TipoUsuarioRepositoryDomain tipoUsuarioRepositoryDomain;

	public List<TipoUsuarioPojo> getAll(){
		return tipoUsuarioRepositoryDomain.getAll();
	}


	public Optional<TipoUsuarioPojo> getTipoUsuarioPojo(int idTipoUsuario){
		return tipoUsuarioRepositoryDomain.getTipoUsuarioPojo(idTipoUsuario);
	}

	public TipoUsuarioPojo save(TipoUsuarioPojo tipoUsuarioPojo){
		return tipoUsuarioRepositoryDomain.save(tipoUsuarioPojo);
	}

	public boolean delete(int idTipoUsuario){
		return getTipoUsuarioPojo(idTipoUsuario).map(tipoUsuarioPojo-> {
			tipoUsuarioRepositoryDomain.delete(idTipoUsuario);
			return true;
		}).orElse(false);
	}

}