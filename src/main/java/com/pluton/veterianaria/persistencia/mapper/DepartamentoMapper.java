package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.DepartmentDomain;
import com.pluton.veterianaria.persistencia.entity.Cliente;
import com.pluton.veterianaria.persistencia.entity.Departamento;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DistrictMapper.class})
public interface DepartamentoMapper {

    @Mappings({
            @Mapping(source = "idDepartamento", target = "idDepartment"),
            @Mapping(source = "nombreDepartamento", target = "nameDepartment"),
    })
    DepartmentDomain toDepartment(Departamento departamento);
    List<DepartmentDomain> toDepartments(List<Departamento> departamento);

    @InheritInverseConfiguration
    Departamento toDepartamento(DepartmentDomain departmentDomain);
    List<Departamento> toDepartamentos(List<DepartmentDomain> departmentDomain);

}
