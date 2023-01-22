package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.TipoUsuarioPojo;

import java.util.List;
import java.util.Optional;

public interface TipoUsuarioRepositoryDomain {

    List<TipoUsuarioPojo> getAll();

    Optional<TipoUsuarioPojo> getTipoUsuario(int idTipoUsuario);

    TipoUsuarioPojo save(TipoUsuarioPojo TipousuarioPojo);

    void delete(int idTipoUsuario);
}
