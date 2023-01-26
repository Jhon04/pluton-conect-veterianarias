package com.pluton.veterianaria.persistencia.crud;

import com.pluton.veterianaria.persistencia.entity.Empresa;

import org.springframework.data.repository.CrudRepository;

public interface EmpresaCrudRepository extends CrudRepository<Empresa, Integer> {


}