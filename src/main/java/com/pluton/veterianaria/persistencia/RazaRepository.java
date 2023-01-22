package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.RazaPojo;
import com.pluton.veterianaria.domain.TipoUsuarioPojo;
import com.pluton.veterianaria.domain.repository.RazaRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.RazaCrudRepository;
import com.pluton.veterianaria.persistencia.entity.Raza;
import com.pluton.veterianaria.persistencia.entity.TipoUsuario;
import com.pluton.veterianaria.persistencia.mapper.RazaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RazaRepository implements RazaRepositoryDomain {

    @Autowired
    private RazaCrudRepository razaCrudRepository;

    @Autowired
    private RazaMapper razaMapper;


    @Override
    public List<RazaPojo> getAll() {
       List<Raza> razas = (List<Raza>) razaCrudRepository.findAll();
       return razaMapper.toRazasPojo(razas);
    }

    @Override
    public Optional<List<RazaPojo>> getByRaza(int razaId) {
        return Optional.empty();
    }

    @Override
    public Optional<RazaPojo> getRaza(int razaId) {
        return razaCrudRepository.findById(razaId).map(raza -> razaMapper.toRazaPojo(raza));
    }

    @Override
    public RazaPojo save(RazaPojo razaPojo) {
        Raza raza = razaMapper.toRaza(razaPojo);
        return razaMapper.toRazaPojo(razaCrudRepository.save(raza));
    }

    @Override
    public void delete(int razaId) {
        razaCrudRepository.deleteById(razaId);
    }
}



