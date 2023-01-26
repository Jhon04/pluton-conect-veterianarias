package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.ClientePojo;
import com.pluton.veterianaria.domain.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;

	@GetMapping("all")
	public List<ClientePojo> getAll(){
		return clienteService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<ClientePojo> getCliente(@PathVariable("id") int idCliente){
		return clienteService.getClientePojo(idCliente);
	}

	@PostMapping("/save")
	public ClientePojo save(@RequestBody ClientePojo clientePojo){
		return clienteService.save(clientePojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idCliente){
		return clienteService.delete(idCliente);
	}

}