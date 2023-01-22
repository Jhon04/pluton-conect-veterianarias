package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.RazaPojo;
import com.pluton.veterianaria.domain.repository.RazaRepositoryDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RazaService {

    @Autowired
    private RazaRepositoryDomain razaRepositoryDomain;

    public List<RazaPojo> getAll() {
        return razaRepositoryDomain.getAll();
    }

    public Optional<RazaPojo> getRaza(int razaId) {
        return razaRepositoryDomain.getRaza(razaId);
    }

    public Optional<List<RazaPojo>> getByRaza(int razaId) {
        return razaRepositoryDomain.getByRaza(razaId);
    }

    public  RazaPojo save(RazaPojo raza) {
        return razaRepositoryDomain.save(raza);
    }

    public boolean delete(int razaId){
        return getRaza(razaId).map(raza -> {
            razaRepositoryDomain.delete(razaId);
            return  true;
        }).orElse(false);
    }

}
