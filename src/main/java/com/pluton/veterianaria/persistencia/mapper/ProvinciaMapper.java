package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.ProvinciaPojo;
import com.pluton.veterianaria.persistencia.entity.Provincia;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface ProvinciaMapper {

	@Mappings({
		@Mapping(source = "idProvincia", target = "idProvincia"),
		@Mapping(source = "idDepartamento", target = "idDepartamento"),
		@Mapping(source = "nombrePro", target = "nombrePro"),
	})
	ProvinciaPojo toProvinciaPojo(Provincia provincia);
	List<ProvinciaPojo> toListProvinciaPojo(List<Provincia> listprovincia);
	@InheritInverseConfiguration
	Provincia toProvincia(ProvinciaPojo provinciapojo);
	List<Provincia> toListProvincia(List<ProvinciaPojo> listprovinciapojo);

}