package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.TipoServicioPojo;

import com.pluton.veterianaria.domain.repository.TipoServicioRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoServicioService {

	@Autowired
	private TipoServicioRepositoryDomain tipoServicioRepositoryDomain;

	public List<TipoServicioPojo> getAll(){
		return tipoServicioRepositoryDomain.getAll();
	}


	public Optional<TipoServicioPojo> getTipoServicioPojo(int idTipoServicio){
		return tipoServicioRepositoryDomain.getTipoServicioPojo(idTipoServicio);
	}

	public TipoServicioPojo save(TipoServicioPojo tipoServicioPojo){
		return tipoServicioRepositoryDomain.save(tipoServicioPojo);
	}

	public boolean delete(int idTipoServicio){
		return getTipoServicioPojo(idTipoServicio).map(tipoServicioPojo-> {
			tipoServicioRepositoryDomain.delete(idTipoServicio);
			return true;
		}).orElse(false);
	}

}