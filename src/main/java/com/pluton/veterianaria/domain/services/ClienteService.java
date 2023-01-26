package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.ClientePojo;

import com.pluton.veterianaria.domain.repository.ClienteRepositoryDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepositoryDomain clienteRepositoryDomain;

	public List<ClientePojo> getAll(){
		return clienteRepositoryDomain.getAll();
	}


	public Optional<ClientePojo> getClientePojo(int idCliente){
		return clienteRepositoryDomain.getClientePojo(idCliente);
	}

	public  Optional<List<ClientePojo>> getByDistritoPojo(int ditrictId) {
		return clienteRepositoryDomain.getByDistritoPojo(ditrictId);
	}

	public ClientePojo save(ClientePojo clientePojo){
		return clienteRepositoryDomain.save(clientePojo);
	}

	public boolean delete(int idCliente){
		return getClientePojo(idCliente).map(clientePojo-> {
			clienteRepositoryDomain.delete(idCliente);
			return true;
		}).orElse(false);
	}

}