package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.ComentarioPojo;
import com.pluton.veterianaria.domain.repository.ComentarioRepositoryDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComentarioService {
    @Autowired
    private ComentarioRepositoryDomain comentarioRepositoryDomain;

    public List<ComentarioPojo> getAll(){
        return comentarioRepositoryDomain.getAll();
    }

    public Optional<ComentarioPojo> getComentario(int idComentario) {
        return comentarioRepositoryDomain.getComentario(idComentario);
    }

    public ComentarioPojo save(ComentarioPojo comentarioPojo) {
        return comentarioRepositoryDomain.save(comentarioPojo);
    }

    public boolean delete(int idComentario) {
        return getComentario(idComentario).map(comentario -> {
            comentarioRepositoryDomain.delete(idComentario);
            return true;
        }).orElse(false);
    }

}
