package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.UsuarioPojo;
import com.pluton.veterianaria.domain.repository.UsuarioRepositoryDomain;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UsuarioService {

    @Autowired
    private UsuarioRepositoryDomain usuarioRepositoryDomain;

    public List<UsuarioPojo> getAll(){
        return usuarioRepositoryDomain.getAll();
    }

    public Optional<List<UsuarioPojo>> getByTipoUsuario(int idTipoUsuario){
        return usuarioRepositoryDomain.getByTipoUsuario(idTipoUsuario);
    }

    public Optional<UsuarioPojo> getUsuario(int idUsuario){
        return usuarioRepositoryDomain.getUsuario(idUsuario);
    }

    public UsuarioPojo save(UsuarioPojo usuarioPojo) {
        return usuarioRepositoryDomain.save(usuarioPojo);
    }

    public boolean delete(int idUsuario){
        return getUsuario(idUsuario).map(usuario -> {
            usuarioRepositoryDomain.delete(idUsuario);
            return true;
        }).orElse(false);
    }

}
