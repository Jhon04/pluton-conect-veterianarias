package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.ComentarioPojo;
import com.pluton.veterianaria.domain.services.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comentario")
public class ComentarioController {
	@Autowired
	private ComentarioService comentarioService;

	@GetMapping("all")
	public List<ComentarioPojo> getAll(){
		return comentarioService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<ComentarioPojo> getComentario(@PathVariable("id") int idComentario){
		return comentarioService.getComentarioPojo(idComentario);
	}

	@PostMapping("/save")
	public ComentarioPojo save(@RequestBody ComentarioPojo comentarioPojo){
		return comentarioService.save(comentarioPojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idComentario){
		return comentarioService.delete(idComentario);
	}

}