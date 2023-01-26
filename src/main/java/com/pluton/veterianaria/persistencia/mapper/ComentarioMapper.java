package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.ComentarioPojo;
import com.pluton.veterianaria.persistencia.entity.Comentario;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface ComentarioMapper {

	@Mappings({
		@Mapping(source = "idComentario", target = "idComentario"),
		@Mapping(source = "idCliente", target = "idCliente"),
		@Mapping(source = "idEstado", target = "idEstado"),
		@Mapping(source = "tituloCom", target = "tituloCom"),
		@Mapping(source = "comentario", target = "comentario"),
	})
	ComentarioPojo toComentarioPojo(Comentario comentario);
	List<ComentarioPojo> toListComentarioPojo(List<Comentario> listcomentario);
	@InheritInverseConfiguration
	Comentario toComentario(ComentarioPojo comentariopojo);
	List<Comentario> toListComentario(List<ComentarioPojo> listcomentariopojo);

}