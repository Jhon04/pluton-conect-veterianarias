package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.DetReservaAtencionServicioPojo;
import com.pluton.veterianaria.persistencia.entity.DetReservaAtencionServicio;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface DetReservaAtencionServicioMapper {

	@Mappings({
		@Mapping(source = "idDetReservaServicio", target = "idDetReservaServicio"),
		@Mapping(source = "idCitaReservaAtencion", target = "idCitaReservaAtencion"),
		@Mapping(source = "idServicio", target = "idServicio"),
	})
	DetReservaAtencionServicioPojo toDetReservaAtencionServicioPojo(DetReservaAtencionServicio detreservaatencionservicio);
	List<DetReservaAtencionServicioPojo> toListDetReservaAtencionServicioPojo(List<DetReservaAtencionServicio> listdetreservaatencionservicio);
	@InheritInverseConfiguration
	@Mappings({
			@Mapping(target = "servicio", ignore = true),
			@Mapping(target = "citaReservaAtencion", ignore = true)
	})
	DetReservaAtencionServicio toDetReservaAtencionServicio(DetReservaAtencionServicioPojo detreservaatencionserviciopojo);
	List<DetReservaAtencionServicio> toListDetReservaAtencionServicio(List<DetReservaAtencionServicioPojo> listdetreservaatencionserviciopojo);

}