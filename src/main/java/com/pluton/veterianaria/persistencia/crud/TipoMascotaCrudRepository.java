package com.pluton.veterianaria.persistencia.crud;

import com.pluton.veterianaria.persistencia.entity.TipoMascota;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TipoMascotaCrudRepository extends CrudRepository<TipoMascota, Integer> {


}