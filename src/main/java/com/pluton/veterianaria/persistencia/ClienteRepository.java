package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.ClientePojo;
import com.pluton.veterianaria.domain.repository.ClienteRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.ClienteCrudRepository;
import com.pluton.veterianaria.persistencia.entity.Cliente;
import com.pluton.veterianaria.persistencia.mapper.ClienteMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository implements ClienteRepositoryDomain {

	@Autowired
	private ClienteCrudRepository clienteCrudRepository;

	@Autowired
	private ClienteMapper clienteMapper;

	@Override
	public List<ClientePojo> getAll() {
		List<Cliente> listCliente = (List<Cliente>) clienteCrudRepository.findAll();
		return clienteMapper.toListClientePojo(listCliente);
	}

	@Override
	public Optional<List<ClientePojo>> getByDistritoPojo(int districtId) {
		return Optional.empty();
	}

	@Override
	public Optional<ClientePojo> getClientePojo(int idCliente){
		return clienteCrudRepository.findById(idCliente).map(cliente -> clienteMapper.toClientePojo(cliente));
	}

	@Override
	public ClientePojo save(ClientePojo clientePojo){
		Cliente cliente = clienteMapper.toCliente(clientePojo);
		return clienteMapper.toClientePojo(clienteCrudRepository.save(cliente));
	}

	@Override
	public void delete (int idCliente){
		clienteCrudRepository.deleteById(idCliente);
	}

}