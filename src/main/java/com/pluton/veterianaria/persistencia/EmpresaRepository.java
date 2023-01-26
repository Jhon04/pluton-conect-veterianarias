package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.EmpresaPojo;
import com.pluton.veterianaria.domain.repository.EmpresaRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.EmpresaCrudRepository;
import com.pluton.veterianaria.persistencia.entity.Empresa;
import com.pluton.veterianaria.persistencia.mapper.EmpresaMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class EmpresaRepository implements EmpresaRepositoryDomain {

	@Autowired
	private EmpresaCrudRepository empresaCrudRepository;

	@Autowired
	private EmpresaMapper empresaMapper;

	@Override
	public List<EmpresaPojo> getAll() {
		List<Empresa> listEmpresa = (List<Empresa>) empresaCrudRepository.findAll();
		return empresaMapper.toListEmpresaPojo(listEmpresa);
	}

	@Override
	public Optional<EmpresaPojo> getEmpresaPojo(int idEmpresa){
		return empresaCrudRepository.findById(idEmpresa).map(empresa -> empresaMapper.toEmpresaPojo(empresa));
	}

	@Override
	public EmpresaPojo save(EmpresaPojo empresaPojo){
		Empresa empresa = empresaMapper.toEmpresa(empresaPojo);
		return empresaMapper.toEmpresaPojo(empresaCrudRepository.save(empresa));
	}

	@Override
	public void delete (int idEmpresa){
		empresaCrudRepository.deleteById(idEmpresa);
	}

}