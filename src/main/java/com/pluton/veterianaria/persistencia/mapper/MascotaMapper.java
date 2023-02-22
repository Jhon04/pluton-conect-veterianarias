package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.MascotaPojo;
import com.pluton.veterianaria.persistencia.entity.Mascota;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import javax.persistence.Column;
import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface MascotaMapper {

	@Mappings({
			@Mapping(source = "idMascota", target = "idMascota"),
			@Mapping(source = "idRaza", target = "idRaza"),
			@Mapping(source = "idEstado", target = "idEstado"),
			@Mapping(source = "nombreMas", target = "nombreMas"),
			@Mapping(source = "edadMas", target = "edadMas"),
			@Mapping(source = "pesoMas", target = "pesoMas"),
			@Mapping(source = "sizeMas", target = "sizeMas"),
	})
	MascotaPojo toMascotaPojo(Mascota mascota);
	List<MascotaPojo> toListMascotaPojo(List<Mascota> listmascota);
	@InheritInverseConfiguration
	@Mappings({
			@Mapping(target = "estado", ignore = true),
			@Mapping(target = "raza", ignore = true),
	})
	Mascota toMascota(MascotaPojo mascotapojo);
	List<Mascota> toListMascota(List<MascotaPojo> listmascotapojo);

}