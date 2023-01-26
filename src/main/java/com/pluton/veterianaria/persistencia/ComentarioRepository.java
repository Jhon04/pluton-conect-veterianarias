package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.ComentarioPojo;
import com.pluton.veterianaria.domain.repository.ComentarioRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.ComentarioCrudRepository;
import com.pluton.veterianaria.persistencia.entity.Comentario;
import com.pluton.veterianaria.persistencia.mapper.ComentarioMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class ComentarioRepository implements ComentarioRepositoryDomain {

	@Autowired
	private ComentarioCrudRepository comentarioCrudRepository;

	@Autowired
	private ComentarioMapper comentarioMapper;

	@Override
	public List<ComentarioPojo> getAll() {
		List<Comentario> listComentario = (List<Comentario>) comentarioCrudRepository.findAll();
		return comentarioMapper.toListComentarioPojo(listComentario);
	}

	@Override
	public Optional<ComentarioPojo> getComentarioPojo(int idComentario){
		return comentarioCrudRepository.findById(idComentario).map(comentario -> comentarioMapper.toComentarioPojo(comentario));
	}

	@Override
	public ComentarioPojo save(ComentarioPojo comentarioPojo){
		Comentario comentario = comentarioMapper.toComentario(comentarioPojo);
		return comentarioMapper.toComentarioPojo(comentarioCrudRepository.save(comentario));
	}

	@Override
	public void delete (int idComentario){
		comentarioCrudRepository.deleteById(idComentario);
	}

}