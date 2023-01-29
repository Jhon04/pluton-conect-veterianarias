package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.DetReservaAtencionServicioPojo;
import com.pluton.veterianaria.domain.services.DetReservaAtencionServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detreservaatencionservicio")
public class DetReservaAtencionServicioController {
	@Autowired
	private DetReservaAtencionServicioService detReservaAtencionServicioService;

	@GetMapping("all")
	public List<DetReservaAtencionServicioPojo> getAll(){
		return detReservaAtencionServicioService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<DetReservaAtencionServicioPojo> getDetReservaAtencionServicio(@PathVariable("id") int idDetReservaServicio){
		return detReservaAtencionServicioService.getDetReservaAtencionServicioPojo(idDetReservaServicio);
	}

	@PostMapping("/save")
	public DetReservaAtencionServicioPojo save(@RequestBody DetReservaAtencionServicioPojo detReservaAtencionServicioPojo){
		return detReservaAtencionServicioService.save(detReservaAtencionServicioPojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idDetReservaServicio){
		return detReservaAtencionServicioService.delete(idDetReservaServicio);
	}

}