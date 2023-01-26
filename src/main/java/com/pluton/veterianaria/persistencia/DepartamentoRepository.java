package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.DepartamentoPojo;
import com.pluton.veterianaria.domain.repository.DepartamentoRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.DepartamentoCrudRepository;
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
		List<Departamento> listDepartamento = (List<Departamento>) departamentoCrudRepository.findAll();
		return departamentoMapper.toListDepartamentoPojo(listDepartamento);
	}

	@Override
	public Optional<DepartamentoPojo> getDepartamentoPojo(int idDepartamento){
		return departamentoCrudRepository.findById(idDepartamento).map(departamento -> departamentoMapper.toDepartamentoPojo(departamento));
	}

	@Override
	public DepartamentoPojo save(DepartamentoPojo departamentoPojo){
		Departamento departamento = departamentoMapper.toDepartamento(departamentoPojo);
		return departamentoMapper.toDepartamentoPojo(departamentoCrudRepository.save(departamento));
	}

	@Override
	public void delete (int idDepartamento){
		departamentoCrudRepository.deleteById(idDepartamento);
	}

}