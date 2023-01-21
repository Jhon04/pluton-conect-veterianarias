package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.ClientDomain;
import com.pluton.veterianaria.domain.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/district/{distritoId}")
    public  Optional<List<ClientDomain>> getByDistrito(@PathVariable("distritoId") int ditrictId) {
        return clientService.getByDistrito(ditrictId);
    }

    @PostMapping("/save")
    public ClientDomain save(@RequestBody ClientDomain client){
        return clientService.save(client);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id}") int clientId){
        return clientService.delete(clientId);
    }
}
