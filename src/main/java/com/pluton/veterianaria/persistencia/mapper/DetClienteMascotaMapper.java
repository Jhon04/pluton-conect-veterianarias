package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.DetClienteMascotaPojo;
import com.pluton.veterianaria.persistencia.entity.DetClienteMascota;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface DetClienteMascotaMapper {

	@Mappings({
		@Mapping(source = "idDetClienteMascota", target = "idDetClienteMascota"),
		@Mapping(source = "idMascota", target = "idMascota"),
		@Mapping(source = "idCliente", target = "idCliente"),
	})
	DetClienteMascotaPojo toDetClienteMascotaPojo(DetClienteMascota detclientemascota);
	List<DetClienteMascotaPojo> toListDetClienteMascotaPojo(List<DetClienteMascota> listdetclientemascota);
	@InheritInverseConfiguration
	@Mappings({
			@Mapping(target = "mascota", ignore = true),
			@Mapping(target = "cliente", ignore = true),
	})
	DetClienteMascota toDetClienteMascota(DetClienteMascotaPojo detclientemascotapojo);
	List<DetClienteMascota> toListDetClienteMascota(List<DetClienteMascotaPojo> listdetclientemascotapojo);

}