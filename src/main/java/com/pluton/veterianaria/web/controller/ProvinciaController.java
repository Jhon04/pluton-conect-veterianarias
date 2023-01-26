package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.ProvinciaPojo;
import com.pluton.veterianaria.domain.services.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/provincia")
public class ProvinciaController {

	@Autowired
	private ProvinciaService provinciaService;

	@GetMapping("/all")
	public List<ProvinciaPojo> getAll(){
		return provinciaService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<ProvinciaPojo> getClient(@PathVariable("id") int clientId){
		return provinciaService.getProvincia(clientId);
	}

	@GetMapping("/departamento/{IdDepartamento}")
	public  Optional<List<ProvinciaPojo>> getByDepartamento(@PathVariable("IdDepartamento") int IdDepartamento) {
		return provinciaService.getByDepartamento(IdDepartamento);
	}

	@PostMapping("/save")
	public ProvinciaPojo save(@RequestBody ProvinciaPojo provincia){
		return provinciaService.save(provincia);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id}") int IdProvincia){
		return provinciaService.delete(IdProvincia);
	}

}