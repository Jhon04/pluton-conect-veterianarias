package com.pluton.veterianaria.persistencia.crud;

import com.pluton.veterianaria.persistencia.entity.TipoUsuario;
import org.springframework.data.repository.CrudRepository;

public interface TipoUsuarioCrudRepository extends CrudRepository<TipoUsuario, Integer> {
}
