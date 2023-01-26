package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.HistorialClinicoPojo;
import com.pluton.veterianaria.persistencia.entity.HistorialClinico;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface HistorialClinicoMapper {

	@Mappings({
		@Mapping(source = "idHistorialClinico", target = "idHistorialClinico"),
		@Mapping(source = "idMascota", target = "idMascota"),
		@Mapping(source = "idServicio", target = "idServicio"),
		@Mapping(source = "idEstado", target = "idEstado"),
		@Mapping(source = "observacionHistorial", target = "observacionHistorial"),
		@Mapping(source = "fechaAtencion", target = "fechaAtencion"),
	})
	HistorialClinicoPojo toHistorialClinicoPojo(HistorialClinico historialclinico);
	List<HistorialClinicoPojo> toListHistorialClinicoPojo(List<HistorialClinico> listhistorialclinico);
	@InheritInverseConfiguration
	HistorialClinico toHistorialClinico(HistorialClinicoPojo historialclinicopojo);
	List<HistorialClinico> toListHistorialClinico(List<HistorialClinicoPojo> listhistorialclinicopojo);

}