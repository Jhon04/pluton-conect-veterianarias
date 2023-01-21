package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.ClientDomain;
import com.pluton.veterianaria.domain.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<ClientDomain> getAll(){
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<ClientDomain> getClient(@PathVariable("id") int clientId){
        return clientService.getClient(clientId);
    }

    public  Optional<List<ClientDomain>> getByDistrito(int ditrictId) {
        return clientService.getByDistrito(ditrictId);
    }

    public ClientDomain save(ClientDomain client){
        return clientService.save(client);
    }

    public boolean delete(int clientId){
        return clientService.delete(clientId);
    }
}
