package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.TipoServicioPojo;
import com.pluton.veterianaria.persistencia.entity.TipoServicio;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface TipoServicioMapper {

	@Mappings({
		@Mapping(source = "idTipoServicio", target = "idTipoServicio"),
		@Mapping(source = "idEstado", target = "idEstado"),
		@Mapping(source = "nombreTipServ", target = "nombreTipServ"),
	})
	TipoServicioPojo toTipoServicioPojo(TipoServicio tiposervicio);
	List<TipoServicioPojo> toListTipoServicioPojo(List<TipoServicio> listtiposervicio);
	@InheritInverseConfiguration
	TipoServicio toTipoServicio(TipoServicioPojo tiposerviciopojo);
	List<TipoServicio> toListTipoServicio(List<TipoServicioPojo> listtiposerviciopojo);

}