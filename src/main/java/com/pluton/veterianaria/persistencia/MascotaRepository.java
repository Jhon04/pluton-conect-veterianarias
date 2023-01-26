package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.MascotaPojo;
import com.pluton.veterianaria.domain.repository.MascotaRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.MascotaCrudRepository;
import com.pluton.veterianaria.persistencia.entity.Mascota;
import com.pluton.veterianaria.persistencia.mapper.MascotaMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class MascotaRepository implements MascotaRepositoryDomain {

	@Autowired
	private MascotaCrudRepository mascotaCrudRepository;

	@Autowired
	private MascotaMapper mascotaMapper;

	@Override
	public List<MascotaPojo> getAll() {
		List<Mascota> listMascota = (List<Mascota>) mascotaCrudRepository.findAll();
		return mascotaMapper.toListMascotaPojo(listMascota);
	}

	@Override
	public Optional<MascotaPojo> getMascotaPojo(int idMascota){
		return mascotaCrudRepository.findById(idMascota).map(mascota -> mascotaMapper.toMascotaPojo(mascota));
	}

	@Override
	public MascotaPojo save(MascotaPojo mascotaPojo){
		Mascota mascota = mascotaMapper.toMascota(mascotaPojo);
		return mascotaMapper.toMascotaPojo(mascotaCrudRepository.save(mascota));
	}

	@Override
	public void delete (int idMascota){
		mascotaCrudRepository.deleteById(idMascota);
	}

}