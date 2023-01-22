package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.ClientePojo;
import com.pluton.veterianaria.domain.UsuarioPojo;
import com.pluton.veterianaria.persistencia.entity.Cliente;
import com.pluton.veterianaria.persistencia.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {TipoUsuarioMapper.class})
public interface UsuarioMapper {

    @Mappings({
            @Mapping(source = "idUsuario"       , target = "idUsuario"      ),
            @Mapping(source = "idTipoUsuario"   , target = "idTipoUsuario"  ),
            @Mapping(source = "email"           , target = "email"          ),
            @Mapping(source = "password"        , target = "password"       ),
            @Mapping(source = "tipoUsuario"     , target = "tipoUsuario"    )
    })
    UsuarioPojo toUsuarioPojo(Usuario usuario);
    List<UsuarioPojo> toUsuariosPojo(List<Usuario> usuarios);

    @InheritInverseConfiguration
    Usuario toUsuario(UsuarioPojo usuarioPojo);
    List<Usuario> toUsuarios(List<UsuarioPojo> usuariosPojo);
}
