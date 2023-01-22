package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.ClientePojo;
import com.pluton.veterianaria.domain.RazaPojo;

import java.util.List;
import java.util.Optional;

public interface RazaRepositoryDomain {

    List<RazaPojo> getAll();

    Optional<List<RazaPojo>> getByRaza(int razaId);

    Optional<RazaPojo> getRaza(int razaId);

    RazaPojo save(RazaPojo razaPojo);

    void  delete(int razaId);
}
