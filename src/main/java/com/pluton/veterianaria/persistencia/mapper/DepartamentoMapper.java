package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.DepartamentoPojo;
import com.pluton.veterianaria.persistencia.entity.Departamento;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DistrictMapper.class})
public interface DepartamentoMapper {

    @Mappings({
            @Mapping(source = "idDepartamento", target = "idDepartamento"),
            @Mapping(source = "nombreDepartamento", target = "nombreDepartamento"),
    })
    DepartamentoPojo toDepartamentoPojo(Departamento departamento);
    List<DepartamentoPojo> toListDepartamentosPojo(List<Departamento> departamento);

    @InheritInverseConfiguration
    Departamento toDepartamento(DepartamentoPojo departamentoPojo);
    List<Departamento> toListDepartamentos(List<DepartamentoPojo> departamentoPojo);

}
