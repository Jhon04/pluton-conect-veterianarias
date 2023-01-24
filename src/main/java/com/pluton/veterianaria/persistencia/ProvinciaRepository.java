package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.ProvinciaPojo;
import com.pluton.veterianaria.domain.repository.ProvinciaRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.ProvinciaCrudRepository;
import com.pluton.veterianaria.persistencia.entity.Cliente;
import com.pluton.veterianaria.persistencia.entity.Provincia;
import com.pluton.veterianaria.persistencia.mapper.ProvinciaMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProvinciaRepository implements ProvinciaRepositoryDomain {

	@Autowired
	private ProvinciaCrudRepository provinciaCrudRepository;

	@Autowired
	private ProvinciaMapper provinciaMapper;

	@Override
	public List<ProvinciaPojo> getAll() {
		List<Provincia> provincias = (List<Provincia>) provinciaCrudRepository.findAll();
		return  provinciaMapper.toListProvinciaPojo(provincias);
	}

	@Override
	public Optional<List<ProvinciaPojo>> getByDepartamento(int IdDepartamento) {
		return Optional.empty();
	}

	@Override
	public Optional<ProvinciaPojo> getProvincia(int IdProvincia) {
		return Optional.empty();
	}

	@Override
	public ProvinciaPojo save(ProvinciaPojo provinciaPojo) {
		return null;
	}

	@Override
	public void delete(int IdProvincia) {

	}
}