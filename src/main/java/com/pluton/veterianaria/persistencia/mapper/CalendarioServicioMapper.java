package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.CalendarioServicioPojo;
import com.pluton.veterianaria.persistencia.entity.CalendarioServicio;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface CalendarioServicioMapper {

	@Mappings({
		@Mapping(source = "idCalendarioServicio", target = "idCalendarioServicio"),
		@Mapping(source = "idEstado", target = "idEstado"),
		@Mapping(source = "mesIni", target = "mesIni"),
		@Mapping(source = "mesFin", target = "mesFin"),
		@Mapping(source = "semanaIni", target = "semanaIni"),
		@Mapping(source = "semanaFin", target = "semanaFin"),
		@Mapping(source = "diaIni", target = "diaIni"),
		@Mapping(source = "diaFin", target = "diaFin"),
		@Mapping(source = "horaIni", target = "horaIni"),
		@Mapping(source = "horaFin", target = "horaFin"),
		@Mapping(source = "diasSemanaNoLaborableIni", target = "diasSemanaNoLaborableIni"),
		@Mapping(source = "diasSemanaNoLaborableFin", target = "diasSemanaNoLaborableFin"),
	})
	CalendarioServicioPojo toCalendarioServicioPojo(CalendarioServicio calendarioservicio);
	List<CalendarioServicioPojo> toListCalendarioServicioPojo(List<CalendarioServicio> listcalendarioservicio);
	@InheritInverseConfiguration
	CalendarioServicio toCalendarioServicio(CalendarioServicioPojo calendarioserviciopojo);
	List<CalendarioServicio> toListCalendarioServicio(List<CalendarioServicioPojo> listcalendarioserviciopojo);

}