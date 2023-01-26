package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.ReservaAtencionPojo;
import com.pluton.veterianaria.domain.repository.ReservaAtencionRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.ReservaAtencionCrudRepository;
import com.pluton.veterianaria.persistencia.entity.ReservaAtencion;
import com.pluton.veterianaria.persistencia.mapper.ReservaAtencionMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class ReservaAtencionRepository implements ReservaAtencionRepositoryDomain {

	@Autowired
	private ReservaAtencionCrudRepository reservaAtencionCrudRepository;

	@Autowired
	private ReservaAtencionMapper reservaAtencionMapper;

	@Override
	public List<ReservaAtencionPojo> getAll() {
		List<ReservaAtencion> listReservaAtencion = (List<ReservaAtencion>) reservaAtencionCrudRepository.findAll();
		return reservaAtencionMapper.toListReservaAtencionPojo(listReservaAtencion);
	}

	@Override
	public Optional<ReservaAtencionPojo> getReservaAtencionPojo(int idCitaReservaAtencion){
		return reservaAtencionCrudRepository.findById(idCitaReservaAtencion).map(reservaAtencion -> reservaAtencionMapper.toReservaAtencionPojo(reservaAtencion));
	}

	@Override
	public ReservaAtencionPojo save(ReservaAtencionPojo reservaAtencionPojo){
		ReservaAtencion reservaAtencion = reservaAtencionMapper.toReservaAtencion(reservaAtencionPojo);
		return reservaAtencionMapper.toReservaAtencionPojo(reservaAtencionCrudRepository.save(reservaAtencion));
	}

	@Override
	public void delete (int idCitaReservaAtencion){
		reservaAtencionCrudRepository.deleteById(idCitaReservaAtencion);
	}

}