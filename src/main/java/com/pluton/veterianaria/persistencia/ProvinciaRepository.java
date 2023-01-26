package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.ProvinciaPojo;
import com.pluton.veterianaria.domain.repository.ProvinciaRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.ProvinciaCrudRepository;
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
		List<Provincia> listProvincia = (List<Provincia>) provinciaCrudRepository.findAll();
		return provinciaMapper.toListProvinciaPojo(listProvincia);
	}

	@Override
	public Optional<List<ProvinciaPojo>> getByDepartamentoPojo(int IdDepartamento) {
		return Optional.empty();
	}

	@Override
	public Optional<ProvinciaPojo> getProvinciaPojo(int idProvincia){
		return provinciaCrudRepository.findById(idProvincia).map(provincia -> provinciaMapper.toProvinciaPojo(provincia));
	}

	@Override
	public ProvinciaPojo save(ProvinciaPojo provinciaPojo){
		Provincia provincia = provinciaMapper.toProvincia(provinciaPojo);
		return provinciaMapper.toProvinciaPojo(provinciaCrudRepository.save(provincia));
	}

	@Override
	public void delete (int idProvincia){
		provinciaCrudRepository.deleteById(idProvincia);
	}

}