package com.pluton.veterianaria.domain.repository;
import com.pluton.veterianaria.domain.ProvinciaPojo;

import java.util.List;
import java.util.Optional;

public interface ProvinciaRepositoryDomain {

    List<ProvinciaPojo> getAll();
    Optional<List<ProvinciaPojo>> getByDepartamento(int IdDepartamento);
    Optional<ProvinciaPojo> getProvincia(int IdProvincia);
    ProvinciaPojo save(ProvinciaPojo provinciaPojo);
    void delete(int IdProvincia);

}