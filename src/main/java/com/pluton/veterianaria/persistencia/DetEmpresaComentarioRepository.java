package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.DetEmpresaComentarioPojo;
import com.pluton.veterianaria.domain.repository.DetEmpresaComentarioRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.DetEmpresaComentarioCrudRepository;
import com.pluton.veterianaria.persistencia.entity.DetEmpresaComentario;
import com.pluton.veterianaria.persistencia.mapper.DetEmpresaComentarioMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class DetEmpresaComentarioRepository implements DetEmpresaComentarioRepositoryDomain {

	@Autowired
	private DetEmpresaComentarioCrudRepository detEmpresaComentarioCrudRepository;

	@Autowired
	private DetEmpresaComentarioMapper detEmpresaComentarioMapper;

	@Override
	public List<DetEmpresaComentarioPojo> getAll() {
		List<DetEmpresaComentario> listDetEmpresaComentario = (List<DetEmpresaComentario>) detEmpresaComentarioCrudRepository.findAll();
		return detEmpresaComentarioMapper.toListDetEmpresaComentarioPojo(listDetEmpresaComentario);
	}

	@Override
	public Optional<DetEmpresaComentarioPojo> getDetEmpresaComentarioPojo(int idDetEmpresaComentario){
		return detEmpresaComentarioCrudRepository.findById(idDetEmpresaComentario).map(detEmpresaComentario -> detEmpresaComentarioMapper.toDetEmpresaComentarioPojo(detEmpresaComentario));
	}

	@Override
	public DetEmpresaComentarioPojo save(DetEmpresaComentarioPojo detEmpresaComentarioPojo){
		DetEmpresaComentario detEmpresaComentario = detEmpresaComentarioMapper.toDetEmpresaComentario(detEmpresaComentarioPojo);
		return detEmpresaComentarioMapper.toDetEmpresaComentarioPojo(detEmpresaComentarioCrudRepository.save(detEmpresaComentario));
	}

	@Override
	public void delete (int idDetEmpresaComentario){
		detEmpresaComentarioCrudRepository.deleteById(idDetEmpresaComentario);
	}

}