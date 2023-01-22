package com.pluton.veterianaria.persistencia.crud;

import com.pluton.veterianaria.persistencia.entity.Departamento;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import java.util.List;

public interface DepartamentoCrudRepository extends CrudRepository<Departamento, Integer> {

    List<Departamento> findByIdDepartamento(int idDepartamento);

    /*@Modifying
    @Transactional
    @Query(value = "UPDATE departamento d SET d.nombre_dep=:depa WHERE d.id_departamento =:id")
    Departamento update(@Param("id") Integer id, @Param("depa") String depa);*/
}
