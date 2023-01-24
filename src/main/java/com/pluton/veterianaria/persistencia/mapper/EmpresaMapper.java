package com.pluton.veterianaria.persistencia.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface EmpresaMapper {

	@Mappings({
		@Mapping(source = "idEmpresa", target = "idEmpresa"),
		@Mapping(source = "idUsuario", target = "idUsuario"),
		@Mapping(source = "idDistrito", target = "idDistrito"),
		@Mapping(source = "nombreEmp", target = "nombreEmp"),
		@Mapping(source = "descripcionEmp", target = "descripcionEmp"),
		@Mapping(source = "emailEmp", target = "emailEmp"),
		@Mapping(source = "celularEmp", target = "celularEmp"),
		@Mapping(source = "imgBackEmp", target = "imgBackEmp"),
		@Mapping(source = "imgEmp", target = "imgEmp"),
		@Mapping(source = "direccionEmp", target = "direccionEmp"),
		@Mapping(source = "ubicacionEmp", target = "ubicacionEmp"),
		@Mapping(source = "calificacionEmp", target = "calificacionEmp"),
		@Mapping(source = "verificacionEmp", target = "verificacionEmp"),
		@Mapping(source = "estado", target = "estado"),
		@Mapping(source = "fechaMod", target = "fechaMod"),
	})
	EmpresaPojo toEmpresaPojo(Empresa empresa);
	List<EmpresaPojo> toListEmpresaPojo(List<Empresa> listempresa);
	@InheritInverseConfiguration
	Empresa toEmpresa(EmpresaPojo empresapojo);
	List<Empresa> toListEmpresa(List<EmpresaPojo> listempresapojo);

}