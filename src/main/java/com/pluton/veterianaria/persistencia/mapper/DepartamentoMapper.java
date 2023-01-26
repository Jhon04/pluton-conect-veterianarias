package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.DepartamentoPojo;
import com.pluton.veterianaria.persistencia.entity.Departamento;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface DepartamentoMapper {

	@Mappings({
		@Mapping(source = "idDepartamento", target = "idDepartamento"),
		@Mapping(source = "idEstado", target = "idEstado"),
		@Mapping(source = "nombreDep", target = "nombreDep"),
	})
	DepartamentoPojo toDepartamentoPojo(Departamento departamento);
	List<DepartamentoPojo> toListDepartamentoPojo(List<Departamento> listdepartamento);
	@InheritInverseConfiguration
	Departamento toDepartamento(DepartamentoPojo departamentopojo);
	List<Departamento> toListDepartamento(List<DepartamentoPojo> listdepartamentopojo);

}