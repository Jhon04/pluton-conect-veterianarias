package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.ClientePojo;
import com.pluton.veterianaria.domain.repository.ClientRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.ClienteCrudRepository;
import com.pluton.veterianaria.persistencia.entity.Cliente;
import com.pluton.veterianaria.persistencia.mapper.ClienteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

// estereotipo de spring framework
@Repository
public class ClienteRepository implements ClientRepositoryDomain {
    @Autowired
    private ClienteCrudRepository clienteCrudRepository;
    @Autowired
    private ClienteMapper clienteMapper;

    @Override
    public List<ClientePojo> getAll() {
        List<Cliente> clientes = (List<Cliente>) clienteCrudRepository.findAll();
        return  clienteMapper.toListClientesPojo(clientes);
    }

    @Override
    public Optional<List<ClientePojo>> getByDistrict(int districtId) {
        List<Cliente> clientes = clienteCrudRepository.findByIdDistritoOrderByNombreAsc(districtId);
        return Optional.of(clienteMapper.toListClientesPojo(clientes));
    }

    @Override
    public Optional<ClientePojo> getClient(int clientId) {
        return clienteCrudRepository.findById(clientId).map(producto -> clienteMapper.toClientePojo(producto));
    }

    @Override
    public ClientePojo save(ClientePojo clientePojo) {
        Cliente cliente = clienteMapper.toCliente(clientePojo);
        return clienteMapper.toClientePojo(clienteCrudRepository.save(cliente));
    }

    @Override
    public void delete (int clientId) {
        clienteCrudRepository.deleteById(clientId);
    }
}
