package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.ComentarioPojo;
import com.pluton.veterianaria.domain.repository.ComentarioRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.ComentarioCrudRepository;
import com.pluton.veterianaria.persistencia.entity.Cliente;
import com.pluton.veterianaria.persistencia.entity.Comentario;
import com.pluton.veterianaria.persistencia.mapper.ComentarioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ComentarioRepository implements ComentarioRepositoryDomain {

    @Autowired
    private ComentarioCrudRepository ComentarioCrudRepository;

    @Autowired
    private ComentarioMapper comentarioMapper;

    @Override
    public List<ComentarioPojo> getAll() {
        List<Comentario> comentarios = (List<Comentario>) ComentarioCrudRepository.findAll();
        return comentarioMapper.toComentariosPojo(comentarios);
    }

    @Override
    public Optional<ComentarioPojo> getComentario(int idComentario) {
        return ComentarioCrudRepository.findById(idComentario).map(comentario -> comentarioMapper.toComentarioPojo(comentario));
    }

    @Override
    public ComentarioPojo save(ComentarioPojo comentarioPojo) {
        Comentario comentario = comentarioMapper.toComentario(comentarioPojo);
        return comentarioMapper.toComentarioPojo(ComentarioCrudRepository.save(comentario));
    }

    @Override
    public void delete(int idComentario) {
        ComentarioCrudRepository.deleteById(idComentario);
    }
}
