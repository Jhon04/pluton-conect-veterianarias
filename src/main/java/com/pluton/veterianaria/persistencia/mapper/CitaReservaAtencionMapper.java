package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.CitaReservaAtencionPojo;
import com.pluton.veterianaria.persistencia.entity.CitaReservaAtencion;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface CitaReservaAtencionMapper {

	@Mappings({
		@Mapping(source = "idCitaReservaAtencion", target = "idCitaReservaAtencion"),
		@Mapping(source = "idCliente", target = "idCliente"),
		@Mapping(source = "idEstado", target = "idEstado"),
		@Mapping(source = "fechaCit", target = "fechaCit"),
		@Mapping(source = "horaIniCit", target = "horaIniCit"),
		@Mapping(source = "horaFinCit", target = "horaFinCit"),
	})
	CitaReservaAtencionPojo toCitaReservaAtencionPojo(CitaReservaAtencion citareservaatencion);
	List<CitaReservaAtencionPojo> toListCitaReservaAtencionPojo(List<CitaReservaAtencion> listcitareservaatencion);
	@InheritInverseConfiguration
	@Mappings({
			@Mapping(target = "cliente", ignore = true),
			@Mapping(target = "estado", ignore = true),
	})
	CitaReservaAtencion toCitaReservaAtencion(CitaReservaAtencionPojo citareservaatencionpojo);
	List<CitaReservaAtencion> toListCitaReservaAtencion(List<CitaReservaAtencionPojo> listcitareservaatencionpojo);

}