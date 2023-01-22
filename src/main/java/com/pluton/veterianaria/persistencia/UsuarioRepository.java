package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.UsuarioPojo;
import com.pluton.veterianaria.domain.repository.UsuarioRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.ClienteCrudRepository;
import com.pluton.veterianaria.persistencia.crud.TipoUsuarioCrudRepository;
import com.pluton.veterianaria.persistencia.crud.UsuarioCrudRepository;
import com.pluton.veterianaria.persistencia.entity.Usuario;
import com.pluton.veterianaria.persistencia.mapper.UsuarioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UsuarioRepository implements UsuarioRepositoryDomain {
    @Autowired
    private UsuarioCrudRepository usuarioCrudRepository;

    @Autowired
    private UsuarioMapper usuarioMapper;


    @Override
    public List<UsuarioPojo> getAll() {
        List<Usuario> usuarios = (List<Usuario>) usuarioCrudRepository.findAll();
        return usuarioMapper.toUsuariosPojo(usuarios);
    }

    @Override
    public Optional<List<UsuarioPojo>> getByTipoUsuario(int idTipoUsuario) {
        List<Usuario> usuarios = usuarioCrudRepository.findByIdTipoUsuarioOrderByIdUsuarioAsc(idTipoUsuario);
        return Optional.of(usuarioMapper.toUsuariosPojo(usuarios));
    }

    @Override
    public Optional<UsuarioPojo> getUsuario(int idUsuario) {
        return usuarioCrudRepository.findById(idUsuario).map(usuario -> usuarioMapper.toUsuarioPojo(usuario));
    }

    @Override
    public UsuarioPojo save(UsuarioPojo usuarioPojo) {
        Usuario usuario = usuarioMapper.toUsuario(usuarioPojo);
        return usuarioMapper.toUsuarioPojo(usuarioCrudRepository.save(usuario));
    }

    @Override
    public void delete(int idUsuario) {
        usuarioCrudRepository.deleteById(idUsuario);
    }
}
