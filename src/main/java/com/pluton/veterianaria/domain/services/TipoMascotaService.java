package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.TipoMascotaPojo;

import com.pluton.veterianaria.domain.repository.TipoMascotaRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoMascotaService {

	@Autowired
	private TipoMascotaRepositoryDomain tipoMascotaRepositoryDomain;

}