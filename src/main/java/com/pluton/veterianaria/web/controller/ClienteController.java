package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.ClientePojo;
import com.pluton.veterianaria.domain.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;

	@GetMapping("all")
	public ResponseEntity<List<ClientePojo>> getAll(){
		return new ResponseEntity<>(clienteService.getAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ClientePojo> getCliente(@PathVariable("id") int idCliente){
		return clienteService.getClientePojo(idCliente)
				.map(cliente -> new ResponseEntity<>(cliente, HttpStatus.OK))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PostMapping("/save")
	public ResponseEntity<ClientePojo> save(@RequestBody ClientePojo clientePojo){
		return new ResponseEntity<>(clienteService.save(clientePojo), HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity delete(@PathVariable("id")int idCliente){
		if (clienteService.delete(idCliente))
			return new ResponseEntity(HttpStatus.OK);
		else
			return new ResponseEntity(HttpStatus.NOT_FOUND);
	}

}