package com.pluton.veterianaria.persistencia.crud;

import com.pluton.veterianaria.domain.repository.UsuarioRepositoryDomain;
import com.pluton.veterianaria.persistencia.entity.Usuario;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioCrudRepository extends CrudRepository<Usuario, Integer> {

    List<Usuario> findByIdTipoUsuarioOrderByIdUsuarioAsc(int idTipoUsuario);

    Usuario findByEmailUsu(String EmailUsu);

    /*
    @Query(value = "UPDATE usuario SET fech_fin_usu = ? WHERE id_usuario = ?", nativeQuery = true)
    void getByIdDistrito();
    */

    //UPDATE tblCustomers
    //    SET Email = 'None'
    //    WHERE [Last Name] = 'Smith'
}