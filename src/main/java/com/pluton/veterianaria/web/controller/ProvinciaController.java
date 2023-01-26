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

	@GetMapping("all")
	public List<ProvinciaPojo> getAll(){
		return provinciaService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<ProvinciaPojo> getProvincia(@PathVariable("id") int idProvincia){
		return provinciaService.getProvinciaPojo(idProvincia);
	}

	@PostMapping("/save")
	public ProvinciaPojo save(@RequestBody ProvinciaPojo provinciaPojo){
		return provinciaService.save(provinciaPojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idProvincia){
		return provinciaService.delete(idProvincia);
	}

}