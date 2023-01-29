package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.DetClienteMascotaPojo;
import com.pluton.veterianaria.domain.repository.DetClienteMascotaRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.DetClienteMascotaCrudRepository;
import com.pluton.veterianaria.persistencia.entity.DetClienteMascota;
import com.pluton.veterianaria.persistencia.mapper.DetClienteMascotaMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class DetClienteMascotaRepository implements DetClienteMascotaRepositoryDomain {

	@Autowired
	private DetClienteMascotaCrudRepository detClienteMascotaCrudRepository;

	@Autowired
	private DetClienteMascotaMapper detClienteMascotaMapper;

	@Override
	public List<DetClienteMascotaPojo> getAll() {
		List<DetClienteMascota> listDetClienteMascota = (List<DetClienteMascota>) detClienteMascotaCrudRepository.findAll();
		return detClienteMascotaMapper.toListDetClienteMascotaPojo(listDetClienteMascota);
	}

	@Override
	public Optional<DetClienteMascotaPojo> getDetClienteMascotaPojo(int idDetClienteMascota){
		return detClienteMascotaCrudRepository.findById(idDetClienteMascota).map(detClienteMascota -> detClienteMascotaMapper.toDetClienteMascotaPojo(detClienteMascota));
	}

	@Override
	public DetClienteMascotaPojo save(DetClienteMascotaPojo detClienteMascotaPojo){
		DetClienteMascota detClienteMascota = detClienteMascotaMapper.toDetClienteMascota(detClienteMascotaPojo);
		return detClienteMascotaMapper.toDetClienteMascotaPojo(detClienteMascotaCrudRepository.save(detClienteMascota));
	}

	@Override
	public void delete (int idDetClienteMascota){
		detClienteMascotaCrudRepository.deleteById(idDetClienteMascota);
	}

}