package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.ClientePojo;
import com.pluton.veterianaria.domain.DepartamentoPojo;
import com.pluton.veterianaria.domain.repository.ClientRepositoryDomain;
import com.pluton.veterianaria.domain.repository.DepartamentoRepositoryDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DepartamentoService {
    @Autowired
    private DepartamentoRepositoryDomain departamentoRepositoryDomain;

    public List<DepartamentoPojo> getAll() {
        return departamentoRepositoryDomain.getAll();
    }

    public Optional<DepartamentoPojo> getDepartamento(int departamentoId) {
        return departamentoRepositoryDomain.getDepartamento(departamentoId);
    }

    public DepartamentoPojo save(DepartamentoPojo departamentoPojo){
        return departamentoRepositoryDomain.save(departamentoPojo);
    }

   /* public DepartamentoPojo update(DepartamentoPojo departamentoPojo){
        return departamentoRepositoryDomain.update(departamentoPojo);
    }*/

    public boolean delete(int departamentoId){

        return getDepartamento(departamentoId).map(depa -> {
            departamentoRepositoryDomain.delete(departamentoId);
            return true;
        }).orElse(false);
    }

}
