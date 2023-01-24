package com.pluton.veterianaria.persistencia.crud;

import com.pluton.veterianaria.persistencia.entity.Cliente;
import com.pluton.veterianaria.persistencia.entity.Provincia;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProvinciaCrudRepository extends CrudRepository<Provincia, Integer> {

    List<Provincia> findByIdDepartamentoOrderByNombreProAsc(int idDepartamento);


}