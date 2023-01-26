package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.DistritoPojo;
import com.pluton.veterianaria.persistencia.entity.Distrito;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface DistritoMapper {

	@Mappings({
		@Mapping(source = "idDistrito", target = "idDistrito"),
		@Mapping(source = "idProvincia", target = "idProvincia"),
		@Mapping(source = "idEstado", target = "idEstado"),
		@Mapping(source = "nombreDis", target = "nombreDis"),
	})
	DistritoPojo toDistritoPojo(Distrito distrito);
	List<DistritoPojo> toListDistritoPojo(List<Distrito> listdistrito);
	@InheritInverseConfiguration
	Distrito toDistrito(DistritoPojo distritopojo);
	List<Distrito> toListDistrito(List<DistritoPojo> listdistritopojo);

}