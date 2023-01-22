package com.pluton.veterianaria.persistencia.crud;

import com.pluton.veterianaria.persistencia.entity.Raza;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RazaCrudRepository extends CrudRepository<Raza, Integer> {



    //List<Raza> findByIdRazaOrderAsc(int idRaza);
}
