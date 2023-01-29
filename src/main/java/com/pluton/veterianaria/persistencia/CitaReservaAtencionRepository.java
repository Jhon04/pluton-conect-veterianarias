package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.CitaReservaAtencionPojo;
import com.pluton.veterianaria.domain.repository.CitaReservaAtencionRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.CitaReservaAtencionCrudRepository;
import com.pluton.veterianaria.persistencia.entity.CitaReservaAtencion;
import com.pluton.veterianaria.persistencia.mapper.CitaReservaAtencionMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class CitaReservaAtencionRepository implements CitaReservaAtencionRepositoryDomain {

	@Autowired
	private CitaReservaAtencionCrudRepository citaReservaAtencionCrudRepository;

	@Autowired
	private CitaReservaAtencionMapper citaReservaAtencionMapper;

	@Override
	public List<CitaReservaAtencionPojo> getAll() {
		List<CitaReservaAtencion> listCitaReservaAtencion = (List<CitaReservaAtencion>) citaReservaAtencionCrudRepository.findAll();
		return citaReservaAtencionMapper.toListCitaReservaAtencionPojo(listCitaReservaAtencion);
	}

	@Override
	public Optional<CitaReservaAtencionPojo> getCitaReservaAtencionPojo(int idCitaReservaAtencion){
		return citaReservaAtencionCrudRepository.findById(idCitaReservaAtencion).map(citaReservaAtencion -> citaReservaAtencionMapper.toCitaReservaAtencionPojo(citaReservaAtencion));
	}

	@Override
	public CitaReservaAtencionPojo save(CitaReservaAtencionPojo citaReservaAtencionPojo){
		CitaReservaAtencion citaReservaAtencion = citaReservaAtencionMapper.toCitaReservaAtencion(citaReservaAtencionPojo);
		return citaReservaAtencionMapper.toCitaReservaAtencionPojo(citaReservaAtencionCrudRepository.save(citaReservaAtencion));
	}

	@Override
	public void delete (int idCitaReservaAtencion){
		citaReservaAtencionCrudRepository.deleteById(idCitaReservaAtencion);
	}

}