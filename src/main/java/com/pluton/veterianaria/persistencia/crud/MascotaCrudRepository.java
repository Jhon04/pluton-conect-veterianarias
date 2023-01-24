package com.pluton.veterianaria.persistencia.crud;

import com.pluton.veterianaria.persistencia.entity.Mascota;

import org.springframework.data.repository.CrudRepository;

public interface MascotaCrudRepository extends CrudRepository<Mascota, Integer> {


}