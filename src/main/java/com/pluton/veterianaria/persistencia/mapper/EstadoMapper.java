package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.EstadoPojo;
import com.pluton.veterianaria.persistencia.entity.Estado;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface EstadoMapper {

	@Mappings({
		@Mapping(source = "idEstado", target = "idEstado"),
		@Mapping(source = "descripcionEstado", target = "descripcionEstado"),
	})
	EstadoPojo toEstadoPojo(Estado estado);
	List<EstadoPojo> toListEstadoPojo(List<Estado> listestado);
	@InheritInverseConfiguration
	Estado toEstado(EstadoPojo estadopojo);
	List<Estado> toListEstado(List<EstadoPojo> listestadopojo);

}