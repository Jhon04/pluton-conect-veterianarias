package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.MascotaPojo;
import com.pluton.veterianaria.domain.repository.MascotaRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.MascotaCrudRepository;
import com.pluton.veterianaria.persistencia.entity.Mascota;
import com.pluton.veterianaria.persistencia.mapper.MascotaMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class MascotaRepository implements MascotaRepositoryDomain {

	@Autowired
	private MascotaCrudRepository mascotaCrudRepository;

	@Autowired
	private MascotaMapper mascotaMapper;

}