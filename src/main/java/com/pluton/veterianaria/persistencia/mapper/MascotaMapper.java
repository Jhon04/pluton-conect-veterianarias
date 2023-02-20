package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.MascotaPojo;
import com.pluton.veterianaria.persistencia.entity.Mascota;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface MascotaMapper {

	@Mappings({
		@Mapping(source = "idMascota", target = "idMascota"),
		@Mapping(source = "idTipoMascota", target = "idTipoMascota"),
		@Mapping(source = "idEstado", target = "idEstado"),
		@Mapping(source = "nombreMas", target = "nombreMas"),
		@Mapping(source = "edadMas", target = "edadMas"),
	})
	MascotaPojo toMascotaPojo(Mascota mascota);
	List<MascotaPojo> toListMascotaPojo(List<Mascota> listmascota);
	@InheritInverseConfiguration
	Mascota toMascota(MascotaPojo mascotapojo);
	List<Mascota> toListMascota(List<MascotaPojo> listmascotapojo);

}