package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.TipoUsuarioPojo;
import com.pluton.veterianaria.domain.UsuarioPojo;
import com.pluton.veterianaria.persistencia.entity.TipoUsuario;
import com.pluton.veterianaria.persistencia.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TipoUsuarioMapper {

    @Mappings({
            @Mapping(source = "idTipoUsuario", target = "idTipoUsuario"),
            @Mapping(source = "nombreTipoUsu", target = "nombreTipoUsu"),
            @Mapping(source = "estado"       , target = "estado"       )
    })
    TipoUsuarioPojo toTipoUsuarioPojo(TipoUsuario tipousuario);
    List<TipoUsuarioPojo> toTipoUsuariosPojo(List<TipoUsuario> tipousuarios);

    @InheritInverseConfiguration
    TipoUsuario toTipoUsuario(TipoUsuarioPojo tipoUsuarioPojo);
    List<TipoUsuario> toTipoUsuarios(List<UsuarioPojo> tipoUsuariosPojo);
}
