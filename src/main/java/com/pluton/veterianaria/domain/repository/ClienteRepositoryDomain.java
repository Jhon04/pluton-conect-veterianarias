package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.ClientePojo;

import java.util.List;
import java.util.Optional;

public interface ClienteRepositoryDomain {

	List<ClientePojo> getAll();
	Optional<List<ClientePojo>> getByDistritoPojo(int districtId);
	Optional<ClientePojo> getClientePojo(int idCliente);
	ClientePojo save(ClientePojo clientePojo);
	void delete(int idCliente);

}