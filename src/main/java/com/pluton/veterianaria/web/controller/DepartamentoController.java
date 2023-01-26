package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.DepartamentoPojo;
import com.pluton.veterianaria.domain.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {
	@Autowired
	private DepartamentoService departamentoService;

	@GetMapping("all")
	public List<DepartamentoPojo> getAll(){
		return departamentoService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<DepartamentoPojo> getDepartamento(@PathVariable("id") int idDepartamento){
		return departamentoService.getDepartamentoPojo(idDepartamento);
	}

	@PostMapping("/save")
	public DepartamentoPojo save(@RequestBody DepartamentoPojo departamentoPojo){
		return departamentoService.save(departamentoPojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idDepartamento){
		return departamentoService.delete(idDepartamento);
	}

}