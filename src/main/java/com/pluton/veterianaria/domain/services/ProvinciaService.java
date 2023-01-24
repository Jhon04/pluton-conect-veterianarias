package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.ProvinciaPojo;

import com.pluton.veterianaria.domain.repository.ProvinciaRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaService {

	@Autowired
	private ProvinciaRepositoryDomain provinciaRepositoryDomain;

}