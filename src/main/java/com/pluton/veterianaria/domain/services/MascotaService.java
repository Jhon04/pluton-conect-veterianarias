package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.MascotaPojo;

import com.pluton.veterianaria.domain.repository.MascotaRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService {

	@Autowired
	private MascotaRepositoryDomain mascotaRepositoryDomain;

}