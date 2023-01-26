package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.DistritoPojo;

import java.util.List;
import java.util.Optional;

public interface DistritoRepositoryDomain {

	List<DistritoPojo> getAll();
	Optional<DistritoPojo> getDistritoPojo(int idDistrito);
	DistritoPojo save(DistritoPojo distritoPojo);
	void delete(int idDistrito);

}