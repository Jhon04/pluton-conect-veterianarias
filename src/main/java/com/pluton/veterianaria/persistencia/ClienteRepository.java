package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.ClientDomain;
import com.pluton.veterianaria.domain.repository.ClientRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.ClienteCrudRepository;
import com.pluton.veterianaria.persistencia.entity.Cliente;
import com.pluton.veterianaria.persistencia.mapper.ClientMapper;
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
    private ClientMapper clientMapper;

    @Override
    public List<ClientDomain> getAll() {
        List<Cliente> clientes = (List<Cliente>) clienteCrudRepository.findAll();
        return  clientMapper.toClients(clientes);
    }

    @Override
    public Optional<List<ClientDomain>> getByDistrict(int districtId) {
        List<Cliente> clientes = clienteCrudRepository.findByIdDistritoOrderByNombreAsc(districtId);
        return Optional.of(clientMapper.toClients(clientes));
    }

    @Override
    public Optional<ClientDomain> getClient(int clientId) {
        return clienteCrudRepository.findById(clientId).map(producto -> clientMapper.toClient(producto));
    }

    @Override
    public ClientDomain save(ClientDomain clientDomain) {
        Cliente cliente = clientMapper.toCliente(clientDomain);
        return clientMapper.toClient(clienteCrudRepository.save(cliente));
    }

    @Override
    public void delete (int clientId) {
        clienteCrudRepository.deleteById(clientId);
    }
}
