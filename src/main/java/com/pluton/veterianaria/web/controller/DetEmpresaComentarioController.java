package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.DetEmpresaComentarioPojo;
import com.pluton.veterianaria.domain.services.DetEmpresaComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detempresacomentario")
public class DetEmpresaComentarioController {
	@Autowired
	private DetEmpresaComentarioService detEmpresaComentarioService;

	@GetMapping("all")
	public List<DetEmpresaComentarioPojo> getAll(){
		return detEmpresaComentarioService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<DetEmpresaComentarioPojo> getDetEmpresaComentario(@PathVariable("id") int idDetEmpresaComentario){
		return detEmpresaComentarioService.getDetEmpresaComentarioPojo(idDetEmpresaComentario);
	}

	@PostMapping("/save")
	public DetEmpresaComentarioPojo save(@RequestBody DetEmpresaComentarioPojo detEmpresaComentarioPojo){
		return detEmpresaComentarioService.save(detEmpresaComentarioPojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idDetEmpresaComentario){
		return detEmpresaComentarioService.delete(idDetEmpresaComentario);
	}

}