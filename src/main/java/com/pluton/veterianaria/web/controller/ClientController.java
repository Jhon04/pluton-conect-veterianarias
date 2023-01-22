package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.ClientePojo;
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
    public List<ClientePojo> getAll(){
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<ClientePojo> getClient(@PathVariable("id") int clientId){
        return clientService.getClient(clientId);
    }

    @GetMapping("/district/{distritoId}")
    public  Optional<List<ClientePojo>> getByDistrito(@PathVariable("distritoId") int ditrictId) {
        return clientService.getByDistrito(ditrictId);
    }

    @PostMapping("/save")
    public ClientePojo save(@RequestBody ClientePojo client){
        return clientService.save(client);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id}") int clientId){
        return clientService.delete(clientId);
    }
}
