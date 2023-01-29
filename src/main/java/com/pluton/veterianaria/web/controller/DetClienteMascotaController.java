package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.DetClienteMascotaPojo;
import com.pluton.veterianaria.domain.services.DetClienteMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detclientemascota")
public class DetClienteMascotaController {
	@Autowired
	private DetClienteMascotaService detClienteMascotaService;

	@GetMapping("all")
	public List<DetClienteMascotaPojo> getAll(){
		return detClienteMascotaService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<DetClienteMascotaPojo> getDetClienteMascota(@PathVariable("id") int idDetClienteMascota){
		return detClienteMascotaService.getDetClienteMascotaPojo(idDetClienteMascota);
	}

	@PostMapping("/save")
	public DetClienteMascotaPojo save(@RequestBody DetClienteMascotaPojo detClienteMascotaPojo){
		return detClienteMascotaService.save(detClienteMascotaPojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idDetClienteMascota){
		return detClienteMascotaService.delete(idDetClienteMascota);
	}

}