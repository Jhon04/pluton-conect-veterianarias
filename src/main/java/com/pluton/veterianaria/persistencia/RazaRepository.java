package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.RazaPojo;
import com.pluton.veterianaria.domain.repository.RazaRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.RazaCrudRepository;
import com.pluton.veterianaria.persistencia.entity.Raza;
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
		List<Raza> listRaza = (List<Raza>) razaCrudRepository.findAll();
		return razaMapper.toListRazaPojo(listRaza);
	}

	@Override
	public Optional<RazaPojo> getRazaPojo(int idRaza){
		return razaCrudRepository.findById(idRaza).map(raza -> razaMapper.toRazaPojo(raza));
	}

	@Override
	public RazaPojo save(RazaPojo razaPojo){
		Raza raza = razaMapper.toRaza(razaPojo);
		return razaMapper.toRazaPojo(razaCrudRepository.save(raza));
	}

	@Override
	public void delete (int idRaza){
		razaCrudRepository.deleteById(idRaza);
	}

}