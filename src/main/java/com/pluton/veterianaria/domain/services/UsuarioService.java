package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.UsuarioPojo;

import com.pluton.veterianaria.domain.repository.UsuarioRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepositoryDomain usuarioRepositoryDomain;

	public List<UsuarioPojo> getAll(){
		return usuarioRepositoryDomain.getAll();
	}

	public Optional<List<UsuarioPojo>> getByTipoUsuarioPojo(int idTipoUsuario){
		return usuarioRepositoryDomain.getByTipoUsuarioPojo(idTipoUsuario);
	}

	public Optional<UsuarioPojo> getUsuarioPojo(int idUsuario){
		return usuarioRepositoryDomain.getUsuarioPojo(idUsuario);
	}

	public UsuarioPojo getUsuarioPojoXNombreUsuario(String nombreUsuario){
		return usuarioRepositoryDomain.getUsuarioPojoXNombreUsuario(nombreUsuario);
	}

	public UsuarioPojo save(UsuarioPojo usuarioPojo){
		return usuarioRepositoryDomain.save(usuarioPojo);
	}

	public boolean delete(int idUsuario){
		return getUsuarioPojo(idUsuario).map(usuarioPojo-> {
			usuarioRepositoryDomain.delete(idUsuario);
			return true;
		}).orElse(false);
	}

}