package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.RazaPojo;
import com.pluton.veterianaria.persistencia.entity.Raza;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface RazaMapper {

	@Mappings({
		@Mapping(source = "idRaza", target = "idRaza"),
		@Mapping(source = "idEstado", target = "idEstado"),
		@Mapping(source = "nombreRaz", target = "nombreRaz"),
	})
	RazaPojo toRazaPojo(Raza raza);
	List<RazaPojo> toListRazaPojo(List<Raza> listraza);
	@InheritInverseConfiguration
	Raza toRaza(RazaPojo razapojo);
	List<Raza> toListRaza(List<RazaPojo> listrazapojo);

}