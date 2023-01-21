package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.ClientDomain;
import com.pluton.veterianaria.domain.repository.ClientRepositoryDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepositoryDomain clientRepositoryDomain;

    public List<ClientDomain> getAll() {
        return clientRepositoryDomain.getAll();
    }

    public Optional<ClientDomain> getClient(int clientId) {
        return clientRepositoryDomain.getClient(clientId);
    }

    public  Optional<List<ClientDomain>> getByDistrito(int ditrictId) {
        return clientRepositoryDomain.getByDistrict(ditrictId);
    }

    public ClientDomain save(ClientDomain client){
        return clientRepositoryDomain.save(client);
    }

    public boolean delete(int clientId){

        return getClient(clientId).map(client -> {
            clientRepositoryDomain.delete(clientId);
            return true;
        }).orElse(false);
    }

}
