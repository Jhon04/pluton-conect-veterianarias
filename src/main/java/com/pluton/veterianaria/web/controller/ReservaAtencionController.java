package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.ReservaAtencionPojo;
import com.pluton.veterianaria.domain.services.ReservaAtencionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservaatencion")
public class ReservaAtencionController {
	@Autowired
	private ReservaAtencionService reservaAtencionService;

	@GetMapping("all")
	public List<ReservaAtencionPojo> getAll(){
		return reservaAtencionService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<ReservaAtencionPojo> getReservaAtencion(@PathVariable("id") int idCitaReservaAtencion){
		return reservaAtencionService.getReservaAtencionPojo(idCitaReservaAtencion);
	}

	@PostMapping("/save")
	public ReservaAtencionPojo save(@RequestBody ReservaAtencionPojo reservaAtencionPojo){
		return reservaAtencionService.save(reservaAtencionPojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idCitaReservaAtencion){
		return reservaAtencionService.delete(idCitaReservaAtencion);
	}

}