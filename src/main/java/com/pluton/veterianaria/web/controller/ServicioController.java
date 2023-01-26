package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.ServicioPojo;
import com.pluton.veterianaria.domain.services.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/servicio")
public class ServicioController {
	@Autowired
	private ServicioService servicioService;

	@GetMapping("all")
	public List<ServicioPojo> getAll(){
		return servicioService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<ServicioPojo> getServicio(@PathVariable("id") int idServicio){
		return servicioService.getServicioPojo(idServicio);
	}

	@PostMapping("/save")
	public ServicioPojo save(@RequestBody ServicioPojo servicioPojo){
		return servicioService.save(servicioPojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idServicio){
		return servicioService.delete(idServicio);
	}

}