package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.RazaPojo;
import com.pluton.veterianaria.domain.services.RazaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/raza")
public class RazaController {
	@Autowired
	private RazaService razaService;

	@GetMapping("all")
	public List<RazaPojo> getAll(){
		return razaService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<RazaPojo> getRaza(@PathVariable("id") int idRaza){
		return razaService.getRazaPojo(idRaza);
	}

	@PostMapping("/save")
	public RazaPojo save(@RequestBody RazaPojo razaPojo){
		return razaService.save(razaPojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idRaza){
		return razaService.delete(idRaza);
	}

}