package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.DetEmpresaComentarioPojo;
import com.pluton.veterianaria.persistencia.entity.DetEmpresaComentario;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface DetEmpresaComentarioMapper {

	@Mappings({
		@Mapping(source = "idDetEmpresaComentario", target = "idDetEmpresaComentario"),
		@Mapping(source = "idEmpresa", target = "idEmpresa"),
		@Mapping(source = "idComentario", target = "idComentario"),
		@Mapping(source = "idEstado", target = "idEstado")
	})
	DetEmpresaComentarioPojo toDetEmpresaComentarioPojo(DetEmpresaComentario detempresacomentario);
	List<DetEmpresaComentarioPojo> toListDetEmpresaComentarioPojo(List<DetEmpresaComentario> listdetempresacomentario);
	@InheritInverseConfiguration
	@Mappings({
			@Mapping(target = "empresa", ignore = true),
			@Mapping(target = "comentario", ignore = true),
			@Mapping(target = "estado", ignore = true)
	})
	DetEmpresaComentario toDetEmpresaComentario(DetEmpresaComentarioPojo detempresacomentariopojo);
	List<DetEmpresaComentario> toListDetEmpresaComentario(List<DetEmpresaComentarioPojo> listdetempresacomentariopojo);

}