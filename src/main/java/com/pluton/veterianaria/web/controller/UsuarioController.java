package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.UsuarioPojo;
import com.pluton.veterianaria.domain.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("all")
	public List<UsuarioPojo> getAll(){
		return usuarioService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<UsuarioPojo> getUsuario(@PathVariable("id") int idUsuario){
		return usuarioService.getUsuarioPojo(idUsuario);
	}

	@PostMapping("/save")
	public UsuarioPojo save(@RequestBody UsuarioPojo usuarioPojo){
		return usuarioService.save(usuarioPojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idUsuario){
		return usuarioService.delete(idUsuario);
	}

}