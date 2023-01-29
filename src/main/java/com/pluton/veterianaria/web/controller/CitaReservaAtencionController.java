package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.CitaReservaAtencionPojo;
import com.pluton.veterianaria.domain.services.CitaReservaAtencionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/citareservaatencion")
public class CitaReservaAtencionController {
	@Autowired
	private CitaReservaAtencionService citaReservaAtencionService;

	@GetMapping("all")
	public List<CitaReservaAtencionPojo> getAll(){
		return citaReservaAtencionService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<CitaReservaAtencionPojo> getCitaReservaAtencion(@PathVariable("id") int idCitaReservaAtencion){
		return citaReservaAtencionService.getCitaReservaAtencionPojo(idCitaReservaAtencion);
	}

	@PostMapping("/save")
	public CitaReservaAtencionPojo save(@RequestBody CitaReservaAtencionPojo citaReservaAtencionPojo){
		return citaReservaAtencionService.save(citaReservaAtencionPojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idCitaReservaAtencion){
		return citaReservaAtencionService.delete(idCitaReservaAtencion);
	}

}