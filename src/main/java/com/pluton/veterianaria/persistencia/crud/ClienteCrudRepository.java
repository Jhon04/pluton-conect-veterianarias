package com.pluton.veterianaria.persistencia.crud;

import com.pluton.veterianaria.persistencia.entity.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteCrudRepository extends CrudRepository<Cliente, Integer> {

    /* ini - Query Native */
    /*
    @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    List<Cliente> getByIdDistrito(int idDistrito);
    */

    /* ini - Query Method's */
    List<Cliente> findByIdDistritoOrderByNombreAsc(int idDistrito);

    Optional<List<Cliente>> findByCelularLessThanAndEstado(int celular, boolean estado);
    /* fin - Query Method's */
}
