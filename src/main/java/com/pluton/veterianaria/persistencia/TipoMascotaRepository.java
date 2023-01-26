package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.TipoMascotaPojo;
import com.pluton.veterianaria.domain.repository.TipoMascotaRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.TipoMascotaCrudRepository;
import com.pluton.veterianaria.persistencia.entity.TipoMascota;
import com.pluton.veterianaria.persistencia.mapper.TipoMascotaMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class TipoMascotaRepository implements TipoMascotaRepositoryDomain {

	@Autowired
	private TipoMascotaCrudRepository tipoMascotaCrudRepository;

	@Autowired
	private TipoMascotaMapper tipoMascotaMapper;

	@Override
	public List<TipoMascotaPojo> getAll() {
		List<TipoMascota> listTipoMascota = (List<TipoMascota>) tipoMascotaCrudRepository.findAll();
		return tipoMascotaMapper.toListTipoMascotaPojo(listTipoMascota);
	}

	@Override
	public Optional<TipoMascotaPojo> getTipoMascotaPojo(int idTipoMascota){
		return tipoMascotaCrudRepository.findById(idTipoMascota).map(tipoMascota -> tipoMascotaMapper.toTipoMascotaPojo(tipoMascota));
	}

	@Override
	public TipoMascotaPojo save(TipoMascotaPojo tipoMascotaPojo){
		TipoMascota tipoMascota = tipoMascotaMapper.toTipoMascota(tipoMascotaPojo);
		return tipoMascotaMapper.toTipoMascotaPojo(tipoMascotaCrudRepository.save(tipoMascota));
	}

	@Override
	public void delete (int idTipoMascota){
		tipoMascotaCrudRepository.deleteById(idTipoMascota);
	}

}