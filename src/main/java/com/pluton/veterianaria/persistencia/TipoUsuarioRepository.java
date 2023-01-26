package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.TipoUsuarioPojo;
import com.pluton.veterianaria.domain.repository.TipoUsuarioRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.TipoUsuarioCrudRepository;
import com.pluton.veterianaria.persistencia.entity.TipoUsuario;
import com.pluton.veterianaria.persistencia.mapper.TipoUsuarioMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class TipoUsuarioRepository implements TipoUsuarioRepositoryDomain {

	@Autowired
	private TipoUsuarioCrudRepository tipoUsuarioCrudRepository;

	@Autowired
	private TipoUsuarioMapper tipoUsuarioMapper;

	@Override
	public List<TipoUsuarioPojo> getAll() {
		List<TipoUsuario> listTipoUsuario = (List<TipoUsuario>) tipoUsuarioCrudRepository.findAll();
		return tipoUsuarioMapper.toListTipoUsuarioPojo(listTipoUsuario);
	}

	@Override
	public Optional<TipoUsuarioPojo> getTipoUsuarioPojo(int idTipoUsuario){
		return tipoUsuarioCrudRepository.findById(idTipoUsuario).map(tipoUsuario -> tipoUsuarioMapper.toTipoUsuarioPojo(tipoUsuario));
	}

	@Override
	public TipoUsuarioPojo save(TipoUsuarioPojo tipoUsuarioPojo){
		TipoUsuario tipoUsuario = tipoUsuarioMapper.toTipoUsuario(tipoUsuarioPojo);
		return tipoUsuarioMapper.toTipoUsuarioPojo(tipoUsuarioCrudRepository.save(tipoUsuario));
	}

	@Override
	public void delete (int idTipoUsuario){
		tipoUsuarioCrudRepository.deleteById(idTipoUsuario);
	}

}