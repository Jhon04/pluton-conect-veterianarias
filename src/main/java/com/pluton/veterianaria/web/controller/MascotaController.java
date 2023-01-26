package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.MascotaPojo;
import com.pluton.veterianaria.domain.services.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mascota")
public class MascotaController {
	@Autowired
	private MascotaService mascotaService;

	@GetMapping("all")
	public List<MascotaPojo> getAll(){
		return mascotaService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<MascotaPojo> getMascota(@PathVariable("id") int idMascota){
		return mascotaService.getMascotaPojo(idMascota);
	}

	@PostMapping("/save")
	public MascotaPojo save(@RequestBody MascotaPojo mascotaPojo){
		return mascotaService.save(mascotaPojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idMascota){
		return mascotaService.delete(idMascota);
	}

}