package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.EstadoPojo;
import com.pluton.veterianaria.domain.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estado")
public class EstadoController {
	@Autowired
	private EstadoService estadoService;

	@GetMapping("all")
	public List<EstadoPojo> getAll(){
		return estadoService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<EstadoPojo> getEstado(@PathVariable("id") int idEstado){
		return estadoService.getEstadoPojo(idEstado);
	}

	@PostMapping("/save")
	public EstadoPojo save(@RequestBody EstadoPojo estadoPojo){
		return estadoService.save(estadoPojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idEstado){
		return estadoService.delete(idEstado);
	}

}