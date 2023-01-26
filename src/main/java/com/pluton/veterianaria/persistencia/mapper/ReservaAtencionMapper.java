package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.ReservaAtencionPojo;
import com.pluton.veterianaria.persistencia.entity.ReservaAtencion;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface ReservaAtencionMapper {

	@Mappings({
		@Mapping(source = "idCitaReservaAtencion", target = "idCitaReservaAtencion"),
		@Mapping(source = "idCliente", target = "idCliente"),
		@Mapping(source = "idEstado", target = "idEstado"),
		@Mapping(source = "fechaCit", target = "fechaCit"),
		@Mapping(source = "horaIniCit", target = "horaIniCit"),
		@Mapping(source = "horaFinCit", target = "horaFinCit"),
	})
	ReservaAtencionPojo toReservaAtencionPojo(ReservaAtencion reservaatencion);
	List<ReservaAtencionPojo> toListReservaAtencionPojo(List<ReservaAtencion> listreservaatencion);
	@InheritInverseConfiguration
	ReservaAtencion toReservaAtencion(ReservaAtencionPojo reservaatencionpojo);
	List<ReservaAtencion> toListReservaAtencion(List<ReservaAtencionPojo> listreservaatencionpojo);

}