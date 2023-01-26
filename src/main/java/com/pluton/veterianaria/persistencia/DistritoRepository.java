package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.DistritoPojo;
import com.pluton.veterianaria.domain.repository.DistritoRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.DistritoCrudRepository;
import com.pluton.veterianaria.persistencia.entity.Distrito;
import com.pluton.veterianaria.persistencia.mapper.DistritoMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class DistritoRepository implements DistritoRepositoryDomain {

	@Autowired
	private DistritoCrudRepository distritoCrudRepository;

	@Autowired
	private DistritoMapper distritoMapper;

	@Override
	public List<DistritoPojo> getAll() {
		List<Distrito> listDistrito = (List<Distrito>) distritoCrudRepository.findAll();
		return distritoMapper.toListDistritoPojo(listDistrito);
	}

	@Override
	public Optional<DistritoPojo> getDistritoPojo(int idDistrito){
		return distritoCrudRepository.findById(idDistrito).map(distrito -> distritoMapper.toDistritoPojo(distrito));
	}

	@Override
	public DistritoPojo save(DistritoPojo distritoPojo){
		Distrito distrito = distritoMapper.toDistrito(distritoPojo);
		return distritoMapper.toDistritoPojo(distritoCrudRepository.save(distrito));
	}

	@Override
	public void delete (int idDistrito){
		distritoCrudRepository.deleteById(idDistrito);
	}

}