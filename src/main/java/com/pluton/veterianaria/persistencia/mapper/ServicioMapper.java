package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.ServicioPojo;
import com.pluton.veterianaria.persistencia.entity.Servicio;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface ServicioMapper {

	@Mappings({
		@Mapping(source = "idServicio", target = "idServicio"),
		@Mapping(source = "idEmpresa", target = "idEmpresa"),
		@Mapping(source = "idTipoServicio", target = "idTipoServicio"),
		@Mapping(source = "idCalendarioServicio", target = "idCalendarioServicio"),
		@Mapping(source = "idEstado", target = "idEstado"),
		@Mapping(source = "nombreSer", target = "nombreSer"),
		@Mapping(source = "descripcionSer", target = "descripcionSer"),
		@Mapping(source = "iconSer", target = "iconSer"),
		@Mapping(source = "duracionSer", target = "duracionSer"),
	})
	ServicioPojo toServicioPojo(Servicio servicio);
	List<ServicioPojo> toListServicioPojo(List<Servicio> listservicio);
	@InheritInverseConfiguration
	Servicio toServicio(ServicioPojo serviciopojo);
	List<Servicio> toListServicio(List<ServicioPojo> listserviciopojo);

}