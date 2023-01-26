package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.HistorialClinicoPojo;
import com.pluton.veterianaria.domain.services.HistorialClinicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/historialclinico")
public class HistorialClinicoController {
	@Autowired
	private HistorialClinicoService historialClinicoService;

	@GetMapping("all")
	public List<HistorialClinicoPojo> getAll(){
		return historialClinicoService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<HistorialClinicoPojo> getHistorialClinico(@PathVariable("id") int idHistorialClinico){
		return historialClinicoService.getHistorialClinicoPojo(idHistorialClinico);
	}

	@PostMapping("/save")
	public HistorialClinicoPojo save(@RequestBody HistorialClinicoPojo historialClinicoPojo){
		return historialClinicoService.save(historialClinicoPojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idHistorialClinico){
		return historialClinicoService.delete(idHistorialClinico);
	}

}