package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.TipoMascotaPojo;
import com.pluton.veterianaria.persistencia.entity.TipoMascota;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface TipoMascotaMapper {

	@Mappings({
		@Mapping(source = "idTipoMascota", target = "idTipoMascota"),
		@Mapping(source = "idEstado", target = "idEstado"),
		@Mapping(source = "nombreTipMas", target = "nombreTipMas"),
	})
	TipoMascotaPojo toTipoMascotaPojo(TipoMascota tipomascota);
	List<TipoMascotaPojo> toListTipoMascotaPojo(List<TipoMascota> listtipomascota);
	@InheritInverseConfiguration
	@Mappings({
			@Mapping(target = "estado", ignore = true)
	})
	TipoMascota toTipoMascota(TipoMascotaPojo tipomascotapojo);
	List<TipoMascota> toListTipoMascota(List<TipoMascotaPojo> listtipomascotapojo);

}