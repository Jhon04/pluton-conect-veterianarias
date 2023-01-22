package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.ClientePojo;
import com.pluton.veterianaria.domain.ComentarioPojo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface ComentarioRepositoryDomain {
    List<ComentarioPojo> getAll();
    Optional<ComentarioPojo> getComentario(int idComentario);
    ComentarioPojo save(ComentarioPojo comentarioPojo);
    void delete(int idComentario);
}
