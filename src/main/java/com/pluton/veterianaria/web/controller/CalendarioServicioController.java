package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.CalendarioServicioPojo;
import com.pluton.veterianaria.domain.services.CalendarioServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/calendarioservicio")
public class CalendarioServicioController {
	@Autowired
	private CalendarioServicioService calendarioServicioService;

	@GetMapping("all")
	public List<CalendarioServicioPojo> getAll(){
		return calendarioServicioService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<CalendarioServicioPojo> getCalendarioServicio(@PathVariable("id") int idCalendarioServicio){
		return calendarioServicioService.getCalendarioServicioPojo(idCalendarioServicio);
	}

	@PostMapping("/save")
	public CalendarioServicioPojo save(@RequestBody CalendarioServicioPojo calendarioServicioPojo){
		return calendarioServicioService.save(calendarioServicioPojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idCalendarioServicio){
		return calendarioServicioService.delete(idCalendarioServicio);
	}

}