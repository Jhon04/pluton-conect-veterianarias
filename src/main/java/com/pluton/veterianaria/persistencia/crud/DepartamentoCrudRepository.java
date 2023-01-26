package com.pluton.veterianaria.persistencia.crud;

import com.pluton.veterianaria.persistencia.entity.Departamento;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DepartamentoCrudRepository extends CrudRepository<Departamento, Integer> {

    List<Departamento> findByIdDepartamento(int idDepartamento);

    /*@Modifying
    @Transactional
    @Query(value = "UPDATE departamento d SET d.nombre_dep=:depa WHERE d.id_departamento =:id")
    Departamento update(@Param("id") Integer id, @Param("depa") String depa);*/

}