package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.DepartamentoPojo;

import java.util.List;
import java.util.Optional;

public interface DepartamentoRepositoryDomain {

    List<DepartamentoPojo> getAll();
    Optional<DepartamentoPojo> getDepartamento(int idDepartamento);
    DepartamentoPojo save(DepartamentoPojo departamentoPojo);
    //DepartamentoPojo update(DepartamentoPojo departamentoPojo);
    void delete(int idDepartamento);
}
