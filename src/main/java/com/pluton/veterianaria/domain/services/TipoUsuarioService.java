package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.TipoUsuarioPojo;
import com.pluton.veterianaria.domain.UsuarioPojo;
import com.pluton.veterianaria.domain.repository.TipoUsuarioRepositoryDomain;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TipoUsuarioService {

    @Autowired
    private TipoUsuarioRepositoryDomain tipoUsuarioRepositoryDomain;

    public List<TipoUsuarioPojo> getAll() {
        return tipoUsuarioRepositoryDomain.getAll();
    }

    public Optional<TipoUsuarioPojo> getTipoUsuario(int idUsuario) {
        return tipoUsuarioRepositoryDomain.getTipoUsuario(idUsuario);
    }

    public TipoUsuarioPojo save(TipoUsuarioPojo usuarioPojo) {
        return tipoUsuarioRepositoryDomain.save(usuarioPojo);
    }

    public boolean delete(int idTipoUsuario) {
        return getTipoUsuario(idTipoUsuario).map(usuario -> {
            tipoUsuarioRepositoryDomain.delete(idTipoUsuario);
            return true;
        }).orElse(false);
    }
}
