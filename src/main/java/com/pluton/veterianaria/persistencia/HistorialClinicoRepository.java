package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.HistorialClinicoPojo;
import com.pluton.veterianaria.domain.repository.HistorialClinicoRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.HistorialClinicoCrudRepository;
import com.pluton.veterianaria.persistencia.entity.HistorialClinico;
import com.pluton.veterianaria.persistencia.mapper.HistorialClinicoMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class HistorialClinicoRepository implements HistorialClinicoRepositoryDomain {

	@Autowired
	private HistorialClinicoCrudRepository historialClinicoCrudRepository;

	@Autowired
	private HistorialClinicoMapper historialClinicoMapper;

	@Override
	public List<HistorialClinicoPojo> getAll() {
		List<HistorialClinico> listHistorialClinico = (List<HistorialClinico>) historialClinicoCrudRepository.findAll();
		return historialClinicoMapper.toListHistorialClinicoPojo(listHistorialClinico);
	}

	@Override
	public Optional<HistorialClinicoPojo> getHistorialClinicoPojo(int idHistorialClinico){
		return historialClinicoCrudRepository.findById(idHistorialClinico).map(historialClinico -> historialClinicoMapper.toHistorialClinicoPojo(historialClinico));
	}

	@Override
	public HistorialClinicoPojo save(HistorialClinicoPojo historialClinicoPojo){
		HistorialClinico historialClinico = historialClinicoMapper.toHistorialClinico(historialClinicoPojo);
		return historialClinicoMapper.toHistorialClinicoPojo(historialClinicoCrudRepository.save(historialClinico));
	}

	@Override
	public void delete (int idHistorialClinico){
		historialClinicoCrudRepository.deleteById(idHistorialClinico);
	}

}