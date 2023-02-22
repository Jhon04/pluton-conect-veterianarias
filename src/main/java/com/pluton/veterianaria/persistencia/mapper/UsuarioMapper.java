package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.UsuarioPojo;
import com.pluton.veterianaria.persistencia.entity.Usuario;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface UsuarioMapper {

	@Mappings({
		@Mapping(source = "idUsuario", target = "idUsuario"),
		@Mapping(source = "idTipoUsuario", target = "idTipoUsuario"),
		@Mapping(source = "idEstado", target = "idEstado"),
		@Mapping(source = "emailUsu", target = "emailUsu"),
		@Mapping(source = "passwordUsu", target = "passwordUsu"),
		@Mapping(source = "fechFinUsu", target = "fechFinUsu"),
	})
	UsuarioPojo toUsuarioPojo(Usuario usuario);
	List<UsuarioPojo> toListUsuarioPojo(List<Usuario> listusuario);
	@InheritInverseConfiguration
	Usuario toUsuario(UsuarioPojo usuariopojo);
	List<Usuario> toListUsuario(List<UsuarioPojo> listusuariopojo);

}