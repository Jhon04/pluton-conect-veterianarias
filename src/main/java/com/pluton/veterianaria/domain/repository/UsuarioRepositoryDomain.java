package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.UsuarioPojo;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepositoryDomain {

    List<UsuarioPojo> getAll();

    Optional<List<UsuarioPojo>> getByTipoUsuario(int idTipoUsuario);

    Optional<UsuarioPojo> getUsuario(int idUsuario);

    UsuarioPojo save(UsuarioPojo usuarioPojo);

    void delete(int idUsuario);

}
