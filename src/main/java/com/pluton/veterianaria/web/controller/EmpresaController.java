package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.EmpresaPojo;
import com.pluton.veterianaria.domain.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
	@Autowired
	private EmpresaService empresaService;

	@GetMapping("all")
	public List<EmpresaPojo> getAll(){
		return empresaService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<EmpresaPojo> getEmpresa(@PathVariable("id") int idEmpresa){
		return empresaService.getEmpresaPojo(idEmpresa);
	}

	@PostMapping("/save")
	public EmpresaPojo save(@RequestBody EmpresaPojo empresaPojo){
		return empresaService.save(empresaPojo);
	}

	@PostMapping("/savecomentario")
	public EmpresaPojo saveComentario(@RequestBody EmpresaPojo empresaPojo){
		return empresaService.saveComentario(empresaPojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idEmpresa){
		return empresaService.delete(idEmpresa);
	}

}