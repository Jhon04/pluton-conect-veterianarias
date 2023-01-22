package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.DepartamentoPojo;
import com.pluton.veterianaria.domain.repository.DepartamentoRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.DepartamentoCrudRepository;
import com.pluton.veterianaria.persistencia.entity.Cliente;
import com.pluton.veterianaria.persistencia.entity.Departamento;
import com.pluton.veterianaria.persistencia.mapper.DepartamentoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class DepartamentoRepository implements DepartamentoRepositoryDomain {
    @Autowired
    private DepartamentoCrudRepository departamentoCrudRepository;
    @Autowired
    private DepartamentoMapper departamentoMapper;

    @Override
    public List<DepartamentoPojo> getAll() {
        List<Departamento> departamento = (List<Departamento>) departamentoCrudRepository.findAll();
        return  departamentoMapper.toListDepartamentosPojo(departamento);

    }

    @Override
    public Optional<DepartamentoPojo> getDepartamento(int idDepartamento) {
        return departamentoCrudRepository.findById(idDepartamento).map(depa -> departamentoMapper.toDepartamentoPojo(depa));
    }

    @Override
    public DepartamentoPojo save(DepartamentoPojo departamentoPojo) {
        Departamento departamento = departamentoMapper.toDepartamento(departamentoPojo);
        return departamentoMapper.toDepartamentoPojo(departamentoCrudRepository.save(departamento));
    }

   /* @Override
    public DepartamentoPojo update(DepartamentoPojo departamentoPojo) {
        Departamento departamento = departamentoMapper.toDepartamento(departamentoPojo);
        return departamentoMapper.toDepartamentoPojo(departamentoCrudRepository.update(departamento.getIdDepartamento(), departamento.getNombreDepartamento()));

    }*/

    @Override
    public void delete(int idDepartamento) {
        departamentoCrudRepository.deleteById(idDepartamento);
    }
}
