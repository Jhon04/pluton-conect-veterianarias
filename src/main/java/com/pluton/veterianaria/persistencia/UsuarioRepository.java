package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.UsuarioPojo;
import com.pluton.veterianaria.domain.repository.UsuarioRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.UsuarioCrudRepository;
import com.pluton.veterianaria.persistencia.entity.Usuario;
import com.pluton.veterianaria.persistencia.mapper.UsuarioMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class UsuarioRepository implements UsuarioRepositoryDomain {

	@Autowired
	private UsuarioCrudRepository usuarioCrudRepository;

	@Autowired
	private UsuarioMapper usuarioMapper;

	@Override
	public List<UsuarioPojo> getAll() {
		List<Usuario> listUsuario = (List<Usuario>) usuarioCrudRepository.findAll();
		return usuarioMapper.toListUsuarioPojo(listUsuario);
	}

	@Override
	public Optional<List<UsuarioPojo>> getByTipoUsuarioPojo(int idTipoUsuario) {
		List<Usuario> usuarios = usuarioCrudRepository.findByIdTipoUsuarioOrderByIdUsuarioAsc(idTipoUsuario);
		return Optional.of(usuarioMapper.toListUsuarioPojo(usuarios));
	}

	@Override
	public Optional<UsuarioPojo> getUsuarioPojo(int idUsuario){
		return usuarioCrudRepository.findById(idUsuario).map(usuario -> usuarioMapper.toUsuarioPojo(usuario));
	}

	@Override
	public UsuarioPojo save(UsuarioPojo usuarioPojo){
		Usuario usuario = usuarioMapper.toUsuario(usuarioPojo);
		return usuarioMapper.toUsuarioPojo(usuarioCrudRepository.save(usuario));
	}

	@Override
	public void delete (int idUsuario){
		usuarioCrudRepository.deleteById(idUsuario);
	}

}