package com.pluton.veterianaria.persistencia.crud;

import com.pluton.veterianaria.domain.repository.UsuarioRepositoryDomain;
import com.pluton.veterianaria.persistencia.entity.Usuario;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioCrudRepository extends CrudRepository<Usuario, Integer> {

    List<Usuario> findByIdTipoUsuarioOrderByIdUsuarioAsc(int idTipoUsuario);

    Usuario findByEmailUsu(String EmailUsu);
}