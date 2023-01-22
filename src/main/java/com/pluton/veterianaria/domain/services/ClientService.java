package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.ClientePojo;
import com.pluton.veterianaria.domain.repository.ClientRepositoryDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepositoryDomain clientRepositoryDomain;

    public List<ClientePojo> getAll() {
        return clientRepositoryDomain.getAll();
    }

    public Optional<ClientePojo> getClient(int clientId) {
        return clientRepositoryDomain.getClient(clientId);
    }

    public  Optional<List<ClientePojo>> getByDistrito(int ditrictId) {
        return clientRepositoryDomain.getByDistrict(ditrictId);
    }

    public ClientePojo save(ClientePojo client){
        return clientRepositoryDomain.save(client);
    }

    public boolean delete(int clientId){

        return getClient(clientId).map(client -> {
            clientRepositoryDomain.delete(clientId);
            return true;
        }).orElse(false);
    }

}
