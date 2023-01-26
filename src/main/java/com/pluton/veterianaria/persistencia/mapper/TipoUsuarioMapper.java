package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.TipoUsuarioPojo;
import com.pluton.veterianaria.persistencia.entity.TipoUsuario;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface TipoUsuarioMapper {

	@Mappings({
		@Mapping(source = "idTipoUsuario", target = "idTipoUsuario"),
		@Mapping(source = "idEstado", target = "idEstado"),
		@Mapping(source = "nombreTipUsu", target = "nombreTipUsu"),
	})
	TipoUsuarioPojo toTipoUsuarioPojo(TipoUsuario tipousuario);
	List<TipoUsuarioPojo> toListTipoUsuarioPojo(List<TipoUsuario> listtipousuario);
	@InheritInverseConfiguration
	TipoUsuario toTipoUsuario(TipoUsuarioPojo tipousuariopojo);
	List<TipoUsuario> toListTipoUsuario(List<TipoUsuarioPojo> listtipousuariopojo);

}