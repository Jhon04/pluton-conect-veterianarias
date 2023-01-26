package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.TipoMascotaPojo;

import com.pluton.veterianaria.domain.repository.TipoMascotaRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoMascotaService {

	@Autowired
	private TipoMascotaRepositoryDomain tipoMascotaRepositoryDomain;

	public List<TipoMascotaPojo> getAll(){
		return tipoMascotaRepositoryDomain.getAll();
	}


	public Optional<TipoMascotaPojo> getTipoMascotaPojo(int idTipoMascota){
		return tipoMascotaRepositoryDomain.getTipoMascotaPojo(idTipoMascota);
	}

	public TipoMascotaPojo save(TipoMascotaPojo tipoMascotaPojo){
		return tipoMascotaRepositoryDomain.save(tipoMascotaPojo);
	}

	public boolean delete(int idTipoMascota){
		return getTipoMascotaPojo(idTipoMascota).map(tipoMascotaPojo-> {
			tipoMascotaRepositoryDomain.delete(idTipoMascota);
			return true;
		}).orElse(false);
	}

}